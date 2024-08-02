import java.util.Scanner;

public class level0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Test[] tests = new Test[4];
        String[] question = {"1. Python에서 변수를 선언하는 방법은? (점수: 10점)","2. Python에서 리스트(List)의 특징은 무엇인가요? (점수: 15점)","3. Python에서 조건문을 작성하는 방법은? (점수: 10점)","4. Python에서 함수를 정의하는 방법은? (점수: 5점)"};
        String[] choice = {"1) var name 2) name = value 3) set name 4) name == value", "1) 순서가 있고 변경 가능하다, 2) 중복된 값을 가질 수 없다, 3) 원소를 추가하거나 삭제할 수 없다, 4) 정렬된 \n" +
                "상태로 유지된다", "1) if-else, 2) for-in, 3) while, 4) def", "1) class, 2) def, 3) import, 4) return"};
        int[] answer = {2,1,1,2};
        int[] score = {10,15,10,5};

        int[] myAnswer = new int[4];
        int myScore = 0;
        char myGrade = 'F';


        for (int i = 0; i < 4; i++) {
            tests[i] = new Test(question[i], choice[i], answer[i], score[i]);
            System.out.println(tests[i].getQuestion());
            System.out.println(tests[i].getChoice());
            System.out.print("- 정답 : ");
            myAnswer[i] = sc.nextInt();

            if (myAnswer[i] == tests[i].getAnswer()) {
                myScore += tests[i].getScore();
            }

            System.out.println();
        }

        System.out.println("-----------결과------------");
        System.out.print("응답한 내용 : ");
        for (int i = 0; i < 4; i++) {
            System.out.print((i+1)+"번 "+myAnswer[i] +", ");
        }

        System.out.println();
        System.out.println("당신 응답 합계 : "+myScore+"점");

        if (myScore > 30) myGrade = 'A';
        else if (myScore > 20) myGrade = 'B';
        else if (myScore > 10) myGrade = 'C';

        System.out.println("학점은 "+myGrade+" 입니다.");



    }
}

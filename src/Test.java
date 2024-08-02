public class Test {
    private String question; //문제
    private String choice; //보기
    private int answer; //답
    private int score; //점수

    public Test(String question, String choice, int answer, int score) {
        this.question = question;
        this.choice = choice;
        this.answer = answer;
        this.score = score;
    }

    public String getQuestion() {
        return question;
    }

    public String getChoice() {
        return choice;
    }

    public int getAnswer() {
        return answer;
    }

    public int getScore() {
        return score;
    }
}


public class Question {
    private String text;
    private String answer;

    public Question(String text, String answer) {
        this.text = text;
        this.answer = answer;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public void display() {
        System.out.println(text);
    }

    public boolean Check(String input) {
        return input.equals(answer);
    }

}

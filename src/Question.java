import java.util.ArrayList;

public class Question {
    private String vraag;
    private String answer;
    private ArrayList<String> meerkeuze = new ArrayList<>();

    public Question(String text, String answer) {
        this.vraag = text;
        this.answer = answer;
    }
    public Question(String text, String answer, ArrayList<String> meerkeuze) {
        this.vraag = text;
        this.answer = answer;
        this.meerkeuze = meerkeuze;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public void display() {
        System.out.println(vraag);
    }

    public ArrayList<String> getMeerkeuze(){
        return this.meerkeuze;
    }
    public String getVraag(){
        return this.vraag;
    }
    public String getAnswer(){
        return this.answer;
    }
    public void getVragen(){
        for (int i = 0; i < meerkeuze.size(); i++) {
            System.out.println((i+1) + " | " + meerkeuze.get(i));
        }
    }
    public boolean Check(String input) {
        return input.equals(answer);
    }

}

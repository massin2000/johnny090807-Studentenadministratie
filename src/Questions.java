import java.util.ArrayList;

public class Questions extends Question{
    private ArrayList<Question> vragen = new ArrayList<>();

    Question (String text, String answer){
        super(text, answer);
    }

}

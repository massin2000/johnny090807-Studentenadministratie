import java.util.ArrayList;

public class ChoiceQuestion extends Question {
        ArrayList<String> answers;
        public ChoiceQuestion (String text, String answer){
            super(text, answer);
            answers = new ArrayList<>();
        }
        public void addAnwers(String answer, boolean correct){
            answers.add(answer);
            if (correct){
                this.setAnswer( Integer.toString(answers.size()));
            }
        }
        public void display(){
            super.display();
            System.out.println();
            for (int i = 1; i <= answers.size() ; i++) {
                System.out.println(i + " - "+ answers.get(i-1));

            }
        }

    }

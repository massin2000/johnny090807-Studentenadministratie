import java.util.Scanner;

public class Main {
    public static void presentQuestion(Question question) {
        Scanner reader = new Scanner(System.in);
        System.out.println(" ");
        question.display();
        String input = reader.nextLine();
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Menu.printMenu();
        System.out.println("");

        System.out.println("Uw keuze:   ");
        Scanner scan = new Scanner(System.in);
        int keuze = scan.nextInt();

        if (keuze == 1) {
            Examens java = new Examens("examen in java. ");
            java.printExamen();
            Examens database = new Examens("examen in database. ");
            database.printExamen();

        } else if (keuze == 2) {

        } else if (keuze == 3) {

        } else if (keuze == 4) {

        } else if (keuze == 5) {


            ChoiceQuestion question1 = new ChoiceQuestion("Vraag (a) : wat is java? ", "Java is een programmeertaal");
            question1.addAnwers("soort computer", false);
            question1.addAnwers("Java is een programmeertaal", true);
            question1.addAnwers("straat in den haag", false);
            question1.addAnwers("java is een mobile tel", false);
            presentQuestion(question1);

            Question question2 = new Question("Vraag (b) : wat is class method in java?", "java");
            presentQuestion(question2);
            Examens databas = new Examens("Examen in database. ");

        } else if (keuze == 6) {

        } else if (keuze == 7) {

        } else if (keuze == 8) {

        } else if (keuze == 9) {
            Menu.ExitMuenu();

        }
    }
}






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
        System.out.println();

        System.out.println("Uw keuze:   ");
        Scanner scan = new Scanner(System.in);
        int keuze = scan.nextInt();
        switch (keuze) {
            case 1:
                System.out.println("1");
                Examens java = new Examens("examen in java. ");
                java.printExamen();
                Examens database = new Examens("examen in database. ");
                database.printExamen();
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                ChoiceQuestion question1 = new ChoiceQuestion("Vraag (a) : wat is java? ", "Java is een programmeertaal");
                question1.addAnwers("soort computer", false);
                question1.addAnwers("Java is een programmeertaal", true);
                question1.addAnwers("straat in den haag", false);
                question1.addAnwers("java is een mobile tel", false);
                presentQuestion(question1);

                Question question2 = new Question("Vraag (b) : wat is class method in java?", "java");
                presentQuestion(question2);
                Examens databas = new Examens("Examen in database. ");
                break;
            case 6:
                System.out.println("6");
                break;
            case 7:
                System.out.println("7");
                break;
            case 8:
                System.out.println("8");
                break;
            case 9:
                System.out.println("9");
                Menu.ExitMenu();
                break;
        }
    }
}






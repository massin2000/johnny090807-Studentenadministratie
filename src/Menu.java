import java.util.Scanner;

public class Menu extends Student {
    public Menu(String StudentNaam, String StudentNummer) {
        super(StudentNaam, StudentNummer);
    }

    public static void presentQuestion(Question question) {
        Scanner reader = new Scanner(System.in);
        System.out.println(" ");
        question.display();
        String input = reader.nextLine();
    }
    public  void printStudenten() {
        for (Student student : this.Studenten) {
            System.out.println(student);
        }
    }

    public static void printMenu() {
        Scanner reader = new Scanner(System.in);
        Studenten studenten = new Studenten();
        studenten.addStudent(new Student("Mhamed Arkoubi", "18048056"));
        studenten.addStudent(new Student("John Klees", "18006434"));
        studenten.addStudent(new Student("houi", "2342423432"));


        System.out.println("***********");
        System.out.println("* Examens  *");
        System.out.println("***********");
        System.out.println();

        System.out.println(" * menu *");
        System.out.println();
        System.out.println("1) Lijst met examens ");
        System.out.println("2) Lijst met studenten");
        System.out.println("3) Nieuwe student inschrijven ");
        System.out.println("4) Student verwijderen ");
        System.out.println("5) Examen afnemen  ");
        System.out.println("6) Is student geslaagd voor test?   ");
        System.out.println("7) Welke examens heeft student gehaald? ");
        System.out.println("8) Welke student heeft de meeste examens gehaald?  ");
        System.out.println("9) Exit");

        System.out.print("Uw keuze: ");
        int nummer = reader.nextInt();

        switch (nummer) {
            case 1:
                Examens examens = new Examens();
                examens.addExamen(new Examen("Java"));
                examens.addExamen(new Examen("Javasda"));
                examens.addExamen(new Examen("Javadsada"));
                examens.addExamen(new Examen("Javasdasdas", "soort"));
                examens.printExamens();
                break;
            case 2:
                studenten.printStudenten();
                break;
            case 3:
               

                break;
            case 4:
                studenten.printStudenten();
                studenten.VerwijderenStudenten();

                break;
            case 5:
                ChoiceQuestion question1 = new ChoiceQuestion("Vraag (a) : wat is java? ", "Java is een programmeertaal");
                question1.addAnwers("soort computer", false);
                question1.addAnwers("Java is een programmeertaal", true);
                question1.addAnwers("straat in den haag", false);
                question1.addAnwers("java is een mobile tel", false);
                presentQuestion(question1);

                Question question2 = new Question("Vraag (b) : wat is class method in java?", "java");
                presentQuestion(question2);
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                ExitMenu();
                break;
        }
    }




    public static void ExitMenu() {

        System.out.print("Bedankt en tot ziens! ");
        }
    }

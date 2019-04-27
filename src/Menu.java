import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void presentQuestion(Question question) {
        Scanner reader = new Scanner(System.in);
        System.out.println(" ");
        question.display();
        String input = reader.nextLine();
    }

    public static int printMenu() {
        Scanner reader = new Scanner(System.in);
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
        System.out.println();

        System.out.print("Uw keuze: ");
        int nummer = 0;
        while(nummer == 0){
            try{
                nummer = reader.nextInt();
            }catch (Exception e){
                System.out.println("Er ging iets mis");

            }
        }
        return nummer;
    }

    public static void ExitMenu() {
        System.out.print("Bedankt en tot ziens! ");
    }
}

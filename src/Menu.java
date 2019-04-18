import java.util.Scanner;

public class Menu {
    private int ExitMenu;


    public static void printMenu() {

        System.out.println("***********");
        System.out.println("* Examens  *");
        System.out.println("***********");
        System.out.println("");

        System.out.println(" * menu *");
        System.out.println("");
        System.out.println("1) Lijst met examens ");
        System.out.println("2) Lijst met studenten");
        System.out.println("3) Nieuwe student inschrijven ");
        System.out.println("4) Student verwijderen ");
        System.out.println("5) Examen afnemen  ");
        System.out.println("6) Is student geslaagd voor test?   ");
        System.out.println("7) Welke examens heeft student gehaald? ");
        System.out.println("8) Welke student heeft de meeste examens gehaald?  ");
        System.out.println("9) Exit");
        System.out.println(" ");

    }

    public static void ExitMenu() {
        System.out.print("Bedankt en tot ziens! ");
    }
}


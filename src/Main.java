import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int nummer = Menu.printMenu();
        ArrayList<String> meerkeuze = new ArrayList<>();
        meerkeuze.add("gewerk");
        meerkeuze.add("sporten");
        meerkeuze.add("school");
        meerkeuze.add("niks");
        meerkeuze.add("uiteten");
        Examens examens = new Examens();
        Studenten studenten = new Studenten();
        Examen Java = examens.addExamen(new Examen("Java",1));
        Java.addVragenToExamen(new Question("Wat heb je gedaan vandaag?", "1", meerkeuze));
        Java.addVragenToExamen(new Question("Waarom ben je goed in java?", "geen idee"));
        meerkeuze = new ArrayList<>();
        meerkeuze.add("soort computer");
        meerkeuze.add("auto");
        meerkeuze.add("speelgoed");
        meerkeuze.add("eten");
        meerkeuze.add("programmeertaal");
        Examen CSharp = examens.addExamen(new Examen("C#", 1));
        CSharp.addVragenToExamen(new Question("wat is de csharp? ", "5", meerkeuze));
        CSharp.addVragenToExamen(new Question("Waarom ben je goed in CSharp?", "geen idee"));

        studenten.addStudent(new Student("Test persoon"));
        studenten.addStudent(new Student("John Klees"));
        boolean running = true;
        while(running){
            switch (nummer) {
                case 1:
                    examens.printExamens();
                    System.out.println();
                    System.out.println("Druk enter om terug naar het menu te gaan.");
                    reader.nextLine();
                    break;
                case 2:
                    studenten.printStudenten();
                    System.out.println();
                    System.out.println("Druk enter om terug naar het menu te gaan.");
                    reader.nextLine();
                    break;
                case 3:
                    Student student = studenten.voegStudentToe();
                    studenten.addStudent(student);
                    studenten.printStudenten();
                    System.out.println();
                    System.out.println("Druk enter om terug naar het menu te gaan.");
                    reader.nextLine();
                    break;
                case 4:
                    studenten.verwijderStudenten();
                    studenten.printStudenten();
                    break;
                case 5:
                    Student Student = studenten.getStudentExamen();
                    if(Student.getStudentNaam() == ""){
                        System.out.println("geen student gevonden.");
                    }else{
                        examens.printExamensWithChoice(studenten.returnStudent(Student));
                    }
                    break;
                case 6:
                    Student = studenten.getStudentGeslaagd();
                    if(Student.getStudentNaam() == ""){
                        System.out.println("geen student gevonden.");
                    }else{
                        examens.studentGeslaagdVoorExamen(Student);
                    }
                    break;
                case 7:
                    Student = studenten.getStudentGeslaagd();
                    if(Student.getStudentNaam() == ""){
                        System.out.println("geen student gevonden.");
                    }else{
                        examens.studentGeslaagdVoorExamens(Student);
                    }
                    break;
                case 8:
                    examens.getStudentMetMeesteGehaaldeExamens(studenten);
                    System.out.println();
                    System.out.println("Druk enter om terug naar het menu te gaan.");
                    reader.nextLine();
                    break;
                case 9:
                    Menu.ExitMenu();
                    running = false;
                    break;
            }
            if(running){
                nummer = Menu.printMenu();
            }
        }
    }

}






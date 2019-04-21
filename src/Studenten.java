import java.util.ArrayList;
import java.util.Scanner;


public class Studenten{
    private ArrayList<Student> Studenten = new ArrayList<>();
    private Scanner reader = new Scanner(System.in);

    public void addStudent(Student student) {
        this.Studenten.add(student);
    }
    public void verwijderStudenten() {
        System.out.println("Welke student wilt u verwijderen?");
        Scanner reader = new Scanner(System.in);
        String verwijderen = reader.nextLine();
        for (int i = 0; i < Studenten.size(); i++) {
            if (Studenten.get(i).getStudentNaam().contains(verwijderen)) {
                Studenten.remove(i);
            }else if (Studenten.get(i).getStudentNummer().contains(verwijderen)){
                Studenten.remove(i);
            }
        }
        printStudenten();
    }
    public void printStudenten() {
        for (Student student : this.Studenten) {
            System.out.println(student);
        }

    }
    public Student voegStudentToe(){
        Menu menu = new Menu();
        String StudentNaam = "";
        String StudentNummer = "";
        System.out.println("Voeg een student toe");
        System.out.println("--------------------");
        System.out.print("Naam: ");
        while(StudentNaam.equals("")){
            try {
                StudentNaam = reader.nextLine();
            }catch (Exception e){
                System.out.println("Iets ging mis.");
            }
            for (Student student: this.Studenten) {
                if(student.getStudentNaam().toLowerCase().equals(StudentNaam.toLowerCase())){
                    System.out.println("Deze student bestaat al.");
                    System.out.print("Naam: ");
                    StudentNaam = "";
                }
            }
        }
        System.out.print("Student nummer: ");
        while(StudentNummer.equals("")){
            try {
                StudentNummer = reader.nextLine();
            }catch (Exception e){
                System.out.println("Iets ging mis.");
            }
            if(StudentNummer.length() < 6){
                System.out.println("Student nummer moet groter dan 6 zijn.");
                System.out.print("Student nummer: ");
                StudentNummer = "";
            }
            for (Student student: this.Studenten) {
                if(student.getStudentNummer().equals(StudentNummer)){
                    System.out.println("Een student heeft dit nummer al.");
                    System.out.print("Student nummer: ");
                    StudentNummer = "";
                }
            }
        }
        return new Student(StudentNaam, StudentNummer);
    }
}




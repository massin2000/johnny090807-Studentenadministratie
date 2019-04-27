import java.util.ArrayList;
import java.util.Scanner;


public class Studenten{
    private Scanner reader = new Scanner(System.in);
    private ArrayList<Student> Studenten = new ArrayList<>();

    public void addStudent(Student student) {
        this.Studenten.add(student);
    }
    public String verwijderStudenten() {
        System.out.println("Welke student wilt u verwijderen?");
        Scanner reader = new Scanner(System.in);
        String verwijderen = reader.nextLine();
        for (int i = 0; i < Studenten.size(); i++) {
            if (Studenten.get(i).getStudentNummer().equals(verwijderen)){
                Studenten.remove(i);
            }
        }
        printStudenten();
        return verwijderen;
    }
    public ArrayList<Student> getStudenten(){
        return this.Studenten;
    }
    public Student getStudentExamen() {
        printStudenten();
        System.out.println("Welk student wilt dit examen maken?");
        Scanner reader = new Scanner(System.in);
        String zoeken = reader.nextLine();
        for (int i = 0; i < Studenten.size(); i++) {
            if (Studenten.get(i).getStudentNummer().equals(zoeken.trim())){
                return Studenten.get(i);
            }
        }
        return new Student("");
    }
    public Student getStudentGeslaagd() {
        printStudenten();
        System.out.println("Welk student wil je selecteren?");
        Scanner reader = new Scanner(System.in);
        String zoeken = reader.nextLine();
        for (int i = 0; i < Studenten.size(); i++) {
            if (Studenten.get(i).getStudentNummer().equals(zoeken)){
                return Studenten.get(i);
            }
        }
        return new Student("");
    }
    public void printStudenten() {
        for (Student student : this.Studenten) {
            System.out.println(student);
    }

    }
    public Student returnStudent(Student studentNr){
        return studentNr;
    }
    public Student voegStudentToe(){
        String StudentNaam = "";
        System.out.println("Voeg een student toe");
        System.out.println("--------------------");
        System.out.print("Naam: ");
        try {
            StudentNaam = reader.nextLine();
        }catch (Exception e){
            System.out.println("Iets ging mis.");
        }
        return new Student(StudentNaam);
    }
}




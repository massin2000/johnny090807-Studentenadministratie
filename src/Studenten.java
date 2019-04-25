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
    public Student getStudent() {
        printStudenten();
        System.out.println("Welk student wilt dit examen maken?");
        Scanner reader = new Scanner(System.in);
        String zoeken = reader.nextLine();
        for (int i = 0; i < Studenten.size(); i++) {
            if (Studenten.get(i).getStudentNaam().toLowerCase().equals(zoeken.toLowerCase())) {
                return Studenten.get(i);
            }else if (Studenten.get(i).getStudentNummer().equals(zoeken)){
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
        return new Student(StudentNaam);
    }
}




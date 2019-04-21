import java.util.ArrayList;
import java.util.Scanner;

public class Studenten{
    private ArrayList<Student> Studenten = new ArrayList<>();

    public void addStudent(Student student) {
        this.Studenten.add(student);
    }
    public void VerwijderenStudenten() {

        System.out.println("welke woorden wilt u verwijderen? ");
        Scanner reader = new Scanner(System.in);
        String verwijderen = reader.nextLine();
        for (int i = 0; i < Studenten.size(); i++) {
            if (Studenten.get(i).getStudentNaam().equals(verwijderen)) {
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
}




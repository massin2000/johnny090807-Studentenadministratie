import java.util.ArrayList;
import java.util.Scanner;

public class Examens {
    private ArrayList<Examen> Examens = new ArrayList<>();

    public Examen addExamen(Examen examen) {
        this.Examens.add(examen);
        return examen;
    }
//    public void verwijderStudent(String verwijderen) {
//        for (int i = 0; i < Examens.size(); i++) {
//            if (Examens.get(i).getStudentNummer().equals(verwijderen)){
//                studenten.remove(i);
//            }
//        }
//    }
    public void printExamens() {
        for (Examen examen: this.Examens) {
            System.out.println(examen);
        }
    }
    public void printExamensWithChoice(Student student) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Welk examen wilt u maken?");
        for (int i = 0; i < Examens.size(); i++) {
            System.out.println((i+1) + " | " + Examens.get(i));
        }
        System.out.println();
        int keuze = 0;
        System.out.print("Keuze: ");
        try{
            keuze = Integer.parseInt(reader.nextLine());
        }catch(Exception e){
            System.out.println("Er ging iets mis met het ingevoerde nummer: " + keuze);
        }
        keuze -= 1;
        try{
            Examens.get(keuze).stelVragen(student);
        }catch (Exception e){
            System.out.println("Er is iets mis gegaan.");
        }
    }
}


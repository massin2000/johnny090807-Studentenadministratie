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
            Examens.get(keuze).stelVragen(student,Examens.get(keuze));
        }catch (Exception e){
            System.out.println("Er is iets mis gegaan.");
        }
    }
    public void studentGeslaagdVoorExamen(Student student) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Welk examen wilt u selecteren?");
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
            Examens.get(keuze).getPogingGeslaagd(student,this.Examens.get(keuze));
        }catch (Exception e){
            System.out.println("Er is iets mis gegaan.");
        }
    }
    public void studentGeslaagdVoorExamens(Student student) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Geslaagde examens:\n");
        for (Examen examen: this.Examens) {
            for (Poging poging: examen.getPogingen()){
                if(poging.getGekoppeldExamen() == examen && poging.getGekoppeldStudent() == student){
                    if(poging.isGeslaagd()){
                        System.out.println("" + examen.getExamenNaam());
                    }
                }
            }
        }
        System.out.println();
        System.out.println("Druk enter om terug naar het menu te gaan.");
        reader.nextLine();
    }
    public void getStudentMetMeesteGehaaldeExamens(Studenten studenten){
        Student hoogsteStudent = new Student("");
        int geslaagd=0;
        for (Student student: studenten.getStudenten()){
            for (Examen examen: Examens) {
                if(examen.getAantalGeslaagdeExamens(student) > geslaagd){
                    hoogsteStudent = student;
                    geslaagd = examen.getAantalGeslaagdeExamens(student);
                }
            }
        }
        if(hoogsteStudent.getStudentNaam() == ""){
            System.out.println("geen hoogst behaald examen bij de studenten.");
        }else{
            System.out.println("Student met meest behaalde examens: ");
            System.out.println("-----------------------");
            System.out.println(hoogsteStudent);
        }
    }
    public ArrayList<Examen> getExamens(){
        return Examens;
    }
}


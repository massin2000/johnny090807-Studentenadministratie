import java.util.ArrayList;
import java.util.Scanner;

public class Examen {
    private String examenNaam;
    private int minimalePunten;
    private ArrayList<Student> studenten = new ArrayList<>();
    private ArrayList<Question> vragen = new ArrayList<>();
    private ArrayList<Poging> pogingen = new ArrayList<>();

    public Examen(String examenNaam, int minimalePunten){
        this.examenNaam = examenNaam;
        this.minimalePunten = minimalePunten;
    }

    public void stelVragen(Student student, Examen examen){
        this.addStudentToExamen(student);
        student.addExamen(examen);
        Poging poging = new Poging(student, examen);
        pogingen.add(poging);
        int geslaagd = 0;
        Scanner reader = new Scanner(System.in);
        for (int i = 0; i < vragen.size(); i++) {
            if(vragen.get(i).getMeerkeuze().size() > 1){
                System.out.println("Vraag " + (i + 1) + ": " + vragen.get(i).getVraag());
                vragen.get(i).getVragen();
                System.out.println();
                System.out.print("Jouw antwoord: ");
                System.out.println();
                String keuze = reader.nextLine();
                boolean goed = vragen.get(i).Check(keuze);
                if(goed){
                    geslaagd++;
                }else{
                    System.out.println("Fout! dit was het goede antwoord: " + vragen.get(i).getAnswer());
                }
            }else{
                System.out.println("Vraag " + (i + 1) + ": " + vragen.get(i).getVraag());
                System.out.println("----------");
                System.out.println();
                System.out.print("Jouw antwoord: ");
                String antwoord = reader.nextLine();
                boolean goed = vragen.get(i).Check(antwoord);
                if(goed){
                    geslaagd++;
                }else{
                    System.out.println("Fout! dit was het goede antwoord: " + vragen.get(i).getAnswer());
                }
            }
        }
        if(geslaagd >= this.minimalePunten){
            System.out.println("Je bent geslaagd!");
            poging.setGeslaagd(true);
            poging.addPoging();
            System.out.println();
            System.out.println("Druk enter om terug naar het menu te gaan.");
            reader.nextLine();
        }else{
            System.out.println("Je bent gezakt :(");
            poging.addPoging();
            System.out.println();
            System.out.println("Druk enter om terug naar het menu te gaan.");
            reader.nextLine();
        }
    }
    public String getExamenNaam(){ return this.examenNaam;}
    public void getPogingGeslaagd(Student student, Examen examen){
        Scanner reader = new Scanner(System.in);
        for (Poging poging: pogingen) {
            if(poging.getGekoppeldExamen() == examen && poging.getGekoppeldStudent() == student){
                if(poging.isGeslaagd()){
                    System.out.println("Deze student is geslaagd voor dit examen");
                }else{
                    System.out.println("Deze student is gezakt voor dit examen");
                }
            }
            else if(poging.getGekoppeldExamen() == null){
                System.out.println("Deze student heeft dit examen nog niet gemaakt.");
            }
        }
        System.out.println();
        System.out.println("Druk enter om terug naar het menu te gaan.");
        reader.nextLine();
    }
    public ArrayList<Poging> getPogingen(){
        return this.pogingen;
    }
    public int getAantalGeslaagdeExamens(Student student){
        int geslaagd = 0;
        for (Poging poging: pogingen) {
            if(student == poging.getGekoppeldStudent()){
                if(poging.isGeslaagd()){
                    geslaagd++;
                }
            }
        }
        return geslaagd;
    }
    public void addVragenToExamen(Question vragen){this.vragen.add(vragen);}
    public void addStudentToExamen(Student student){
        this.studenten.add(student);
    }
    @Override
    public String toString() {
            return "Examen naam: " + examenNaam;
    }
}

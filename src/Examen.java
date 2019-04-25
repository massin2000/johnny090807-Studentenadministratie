import java.util.ArrayList;
import java.util.Scanner;

public class Examen {
    private String examenNaam;
    private int minimalePunten;
    private ArrayList<Student> studenten = new ArrayList<>();
    private ArrayList<Question> vragen = new ArrayList<>();

    public Examen(String examenNaam, int minimalePunten){
        this.examenNaam = examenNaam;
        this.minimalePunten = minimalePunten;
    }

    public void stelVragen(Student student){
        studenten.add(student);
        student.addExamen(new Examen(examenNaam, minimalePunten));
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
                }
            }
        }
        if(geslaagd > this.minimalePunten){
            System.out.println("Je bent geslaagd!");
        }else{
            System.out.println("Je bent gezakt :(");
        }
    }
    public String getExamenNaam(){ return this.examenNaam;}
    public void addVragenToExamen(Question vragen){this.vragen.add(vragen);}
    public void addStudentToExamen(Student student){
        this.studenten.add(student);
    }
    @Override
    public String toString() {
            return "Examen naam: " + examenNaam;
    }
}

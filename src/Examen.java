import java.util.ArrayList;
import java.util.Scanner;

public class Examen {
    private String soortExamen;
    private String examenNaam;
    private ArrayList<Student> studenten = new ArrayList<>();
    private ArrayList<Question> vragen = new ArrayList<>();

    public Examen(String examenNaam){
        this.examenNaam = examenNaam;
    }

    public Examen(String examenNaam, String soortExamen){
        this.examenNaam = examenNaam;
        this.soortExamen = soortExamen;
    }

    public void stelVragen(){
        Scanner reader = new Scanner(System.in);
        for (int i = 0; i < vragen.size(); i++) {
            if(vragen.get(i).getMeerkeuze().size() > 1){
                System.out.println("Vraag " + (i + 1));
                System.out.println("----------");
                System.out.println("Vraag: " + vragen.get(i).getVraag());
                vragen.get(i).getVragen();
                System.out.println();
                System.out.print("Jouw antwoord: ");
                String keuze = reader.nextLine();
                vragen.get(i).Check(keuze);
            }else{
                System.out.println("Vraag " + (i + 1));
                System.out.println("----------");
                System.out.println(vragen.get(i).getVraag());
                System.out.println("----------");
                System.out.println();
                System.out.print("Jouw antwoord: ");
                String antwoord = reader.nextLine();

            }
        }
    }
    public void addVragenToExamen(Question vragen){this.vragen.add(vragen);}
    public void addStudentToExamen(Student student){
        this.studenten.add(student);
    }
    @Override
    public String toString() {
        if(soortExamen == null){
            return "Examen naam: " + examenNaam;
        }else{
            return "Examen naam: " + examenNaam + " | Soort examen: " + soortExamen;
        }
    }
}

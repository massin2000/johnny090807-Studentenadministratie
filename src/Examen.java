import java.util.ArrayList;

public class Examen {
    private String soortExamen;
    private String examenNaam;
    private ArrayList<Studenten> studenten = new ArrayList<>();

    public Examen(String examenNaam){
        this.examenNaam = examenNaam;
    }

    public Examen(String examenNaam, String soortExamen){
        this.examenNaam = examenNaam;
        this.soortExamen = soortExamen;
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

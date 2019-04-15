import java.util.ArrayList;

public class Examens {
    private String soortexamen;
    private String naam;
    private ArrayList<Examens> Examens = new ArrayList<Examens>();

    public Examens(String naam) {
        this.naam = naam;
    }


    public void addExamen(Examens examen) {
        this.Examens.add(examen);

    }

    public void printExamen() {
        System.out.println("Examen naam: " + this.naam);
        for (Examens thisExamen : this.Examens) {
            System.out.println( thisExamen);

        }
    }
}


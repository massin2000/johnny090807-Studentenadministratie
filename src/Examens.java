import java.util.ArrayList;

public class Examens {
    private ArrayList<Examen> Examens = new ArrayList<Examen>();

    public void addExamen(Examen examen) {
        this.Examens.add(examen);
    }

    public void printExamens() {
        for (Examen examen: this.Examens) {
            System.out.println(examen);
        }
    }
}


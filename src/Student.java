import java.util.ArrayList;
import java.util.Random;

public class Student {

    protected String StudentNaam;
    protected String StudentNummer;
    protected ArrayList<Examen> gemaakteExamens = new ArrayList<>();

    public Student(String StudentNaam) {
        this.StudentNaam = StudentNaam;
        this.StudentNummer = Integer.toString(getRandomNumberInRange(1, 9));
        for (int i = 0; i < 7; i++) {
            this.StudentNummer += Integer.toString(getRandomNumberInRange(1, 9));
        }
    }
    public void addExamen(Examen gemaakteExamen){
        for (Examen examen: gemaakteExamens) {
            if(examen.getExamenNaam() != gemaakteExamen.getExamenNaam()){
                gemaakteExamens.add(gemaakteExamen);
            }
        }
    }
    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public String getStudentNaam() {
        return this.StudentNaam;
    }

    public String getStudentNummer() {
        return this.StudentNummer;
    }

    @Override
    public String toString() {
        return "Student: " + StudentNaam + " | " + StudentNummer;
    }
}



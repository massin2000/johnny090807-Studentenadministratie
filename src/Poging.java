public class Poging {
    private int aantalPogingen;
    private Student gekoppeldStudent;
    private Examen gekoppeldExamen;
    private boolean geslaagd;

    public Poging(Student student, Examen examen){
        this.gekoppeldStudent = student;
        this.gekoppeldExamen = examen;
    }

    public void addPoging(){
        this.aantalPogingen++;
    }
    public void setGeslaagd(
            boolean geslaagd){
        this.geslaagd = geslaagd;
    }
    public Student getGekoppeldStudent(){
        return  this.gekoppeldStudent;
    }
    public Examen getGekoppeldExamen(){
        return  this.gekoppeldExamen;
    }
    public boolean isGeslaagd (){
        return this.geslaagd;
    }

    @Override
    public String toString() {
        return gekoppeldStudent.getStudentNaam() + " | " + gekoppeldStudent.getStudentNummer() + " " + gekoppeldExamen.getExamenNaam() + " || " + geslaagd;
    }
}

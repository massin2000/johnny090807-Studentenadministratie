public class Student {

    protected String StudentNaam;
    protected String StudentNummer;
    protected boolean geslaagd;

    public Student(String StudentNaam, String StudentNummer) {
        this.StudentNaam = StudentNaam;
        this.StudentNummer = StudentNummer;
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



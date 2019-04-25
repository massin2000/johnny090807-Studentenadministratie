import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int nummer = Menu.printMenu();
        ArrayList<String> meerkeuze = new ArrayList<>();
        meerkeuze.add("hahaha");
        meerkeuze.add("sdfsdf");
        meerkeuze.add("hassddfsdhaha");
        meerkeuze.add("hahfsdfsaha");
        meerkeuze.add("hahsdfsdaha");
        Examens examens = new Examens();
        Studenten studenten = new Studenten();
        Examen Java = examens.addExamen(new Examen("Java",1));
        Java.addVragenToExamen(new Question("Wat heb je gedaan vandaag?", "1", meerkeuze));
        Java.addVragenToExamen(new Question("Waarom ben je goed in java?", "geen idee"));

        Examen CSharp = examens.addExamen(new Examen("C#", 1));
        CSharp.addVragenToExamen(new Question("Wat heb je gedaan vandaag?", "1", meerkeuze));
        CSharp.addVragenToExamen(new Question("Waarom ben je goed in CSharp?", "geen idee"));

        studenten.addStudent(new Student("Test persoon"));
        boolean running = true;
        while(running){
            switch (nummer) {
                case 1:
                    examens.printExamens();
                    break;
                case 2:
                    studenten.printStudenten();
                    break;
                case 3:
                    Student student = studenten.voegStudentToe();
                    studenten.addStudent(student);
                    studenten.printStudenten();
                    break;
                case 4:
                    String verwijder = studenten.verwijderStudenten();
//                    examens.verwijderStudenten(verwijder);
                    studenten.printStudenten();
                    break;
                case 5:
                    Student studentNr = studenten.getStudent();
                    if(studentNr.getStudentNaam() == ""){
                        System.out.println("geen student gevonden.");
                    }else{
                        examens.printExamensWithChoice(studenten.returnStudent(studentNr));
                    }
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    Menu.ExitMenu();
                    running = false;
                    break;
            }
            if(running){
                nummer = Menu.printMenu();
            }
        }
    }

}






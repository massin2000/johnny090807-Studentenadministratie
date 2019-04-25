import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> meerkeuze = new ArrayList<>();
        meerkeuze.add("hahaha");
        meerkeuze.add("sdfsdf");
        meerkeuze.add("hassddfsdhaha");
        meerkeuze.add("hahfsdfsaha");
        meerkeuze.add("hahsdfsdaha");
        int nummer = Menu.printMenu();
        Examens examens = new Examens();
        Studenten studenten = new Studenten();
        Examen Java = examens.addExamen(new Examen("jaja"));
        Java.addVragenToExamen(new Question("Wat heb je gedaan vandaag?", "1", meerkeuze));
        Java.addVragenToExamen(new Question("sdasd", "dsadasd"));

        meerkeuze = new ArrayList<>();
        examens.addExamen(new Examen("lkdfjdjg"));
        examens.addExamen(new Examen("JajaJava", "moniee"));
        examens.addExamen(new Examen("HOI"));
        examens.addExamen(new Examen("Lekkerdan"));
        examens.addExamen(new Examen("geenidee", "geld"));
        studenten.addStudent(new Student("John Klees", "18006434"));
        studenten.addStudent(new Student("Mhamed Arkoubi", "18003452"));
        studenten.addStudent(new Student("Test persoon", "00000000"));
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
                    studenten.printStudenten();
                    studenten.verwijderStudenten();
                    break;
                case 5:
                    examens.printExamensWithChoice();
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






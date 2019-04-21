import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    protected String StudentNaam;
   protected String StudentNummer;
protected ArrayList<Student> Studenten = new ArrayList<>();


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


    public  void printStudenten() {
        for (Student student : this.Studenten) {
            System.out.println(student);
        }
    }

    @Override
    public String toString() {
        return "Student: " + StudentNaam + " | " + StudentNummer;
    }
    }











//    static ArrayList<String> wordenlijs = new ArrayList<>();
//    public static void main(String[] args) {
//
//        System.out.println("type jou woorden aub, typ ok als u klaar bent: ");
//        String woorden = reader.nextLine();
//
//        while (!woorden.equals("ok")) {
//            wordenlijs.add(woorden);
//            woorden = reader.nextLine();
//        }
//        printArray();
//        System.out.println("welke woorden wilt u verwijderen? ");
//        String verwijderen = reader.nextLine();
//        for (int i = 0; i <wordenlijs.size() ; i++) {
//            if(wordenlijs.get(i).equals(verwijderen)){
//                wordenlijs.remove(verwijderen);
//                printArray();
//                break;
//            }
//        }
//    }
//
//    public static void printArray(){
//        System.out.println("**************************");
//        for(  String woord: wordenlijs){
//            System.out.println(woord);
//        }


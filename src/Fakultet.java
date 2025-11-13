import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Fakultet {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", "Horvat", 21, "M", 3);
        Student student2 = new Student("Ivana", "Bulj", 20, "Ž", 2);
        Student student3 = new Student("Pero", "Djetlić", 24, "M", 4);

        Profesor profesor1 = new Profesor("Mladen", "Tolj", 45, "M", "Uvod u anatomiju");
        Profesor profesor2 = new Profesor("Marija", "Škec", 39, "Ž", "Virologija");

//        System.out.println(student1.predstavljanje());
//        student1.dohvatiOpisUloge();
//
//        System.out.println(student2.predstavljanje());
//        student2.dohvatiOpisUloge();
//
//        System.out.println(profesor1.predstavljanje());
//        profesor1.dohvatiOpisUloge();
//
//        System.out.println(profesor2.predstavljanje());
//        profesor2.dohvatiOpisUloge();


        ArrayList<Student> studenti = new ArrayList<>();
        studenti.add(student1);
        studenti.add(student2);
        studenti.add(student3);

        // Ispis prije sorta
        System.out.println("Ispis prije sortiranja");
        for(Student s : studenti){
            System.out.println(s.predstavljanje());
            s.dohvatiOpisUloge();
        }

        Collections.sort(studenti);

        // Ispis poslije sorta
        System.out.println("\nIspis nakon sortiranja");
        for(Student s : studenti){
            System.out.println(s.predstavljanje());
            s.dohvatiOpisUloge();
        }

        Collections.reverse(studenti);

        // Ispis poslije sorta - reverzni
        System.out.println("\nIspis nakon reverznog sortiranja");
        for(Student s : studenti){
            System.out.println(s.predstavljanje());
            s.dohvatiOpisUloge();
        }
    }
}

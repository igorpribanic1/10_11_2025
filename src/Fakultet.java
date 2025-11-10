public class Fakultet {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", "Horvat", 21, "M", 2);
        Student student2 = new Student("Ivana", "Bulj", 20, "Ž", 2);

        Profesor profesor1 = new Profesor("Mladen", "Tolj", 45, "M", "Uvod u anatomiju");
        Profesor profesor2 = new Profesor("Marija", "Škec", 39, "Ž", "Virologija");

        System.out.println(student1.predstavljanje());
        student1.dohvatiOpisUloge();

        System.out.println(student2.predstavljanje());
        student2.dohvatiOpisUloge();

        System.out.println(profesor1.predstavljanje());
        profesor1.dohvatiOpisUloge();

        System.out.println(profesor2.predstavljanje());
        profesor2.dohvatiOpisUloge();
    }
}

import java.math.BigInteger;

public class Student extends Osoba implements Comparable<Student> {
    private int godinaStudija;

    public Student(String firstName, String lastName, int age, String sex, int godinaStudija) {
        super(firstName, lastName, age, sex);
        this.godinaStudija = godinaStudija;
    }

    public int getGodinaStudija() {
        return godinaStudija;
    }

    @Override
    public String predstavljanje() {
        return super.predstavljanje() + ", Godina studija: " + godinaStudija;
    }

    @Override
    public void dohvatiOpisUloge() {
        System.out.println("Ja sam student: " + super.firstName + " " + super.lastName);
    }

    @Override
    public int compareTo(Student o) {
        return Integer.valueOf(getGodinaStudija()).compareTo(Integer.valueOf(o.getGodinaStudija()));
    }
}

public class Student extends Osoba{
    private int godinaStudija;

    public Student(String firstName, String lastName, int age, String sex, int godinaStudija) {
        super(firstName, lastName, age, sex);
        this.godinaStudija = godinaStudija;
    }

    @Override
    public String predstavljanje() {
        return super.predstavljanje() + ", Godina studija: " + godinaStudija;
    }

    @Override
    public void dohvatiOpisUloge() {
        System.out.println("Ja sam student: " + super.firstName + " " + super.lastName);
    }
}

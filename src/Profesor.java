public class Profesor extends Osoba{
    private String kolegij;

    public Profesor(String firstName, String lastName, int age, String sex, String kolegij) {
        super(firstName, lastName, age, sex);
        this.kolegij = kolegij;
    }

    @Override
    public String predstavljanje() {
        return super.predstavljanje() + ", Kolegij: " + kolegij;
    }

    @Override
    public void dohvatiOpisUloge() {
        System.out.println("Ja sam profesor: " + super.firstName + " " + super.lastName);
    }
}

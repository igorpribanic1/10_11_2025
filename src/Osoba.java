public abstract class Osoba {
    String firstName;
    String lastName;
    int age;
    String sex;

    public Osoba(String firstName, String lastName, int age, String sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public String predstavljanje() {
        return "Ime: " + firstName + ", Prezime: " + lastName + ", Dob:" + age + ", Spol: " + sex;
    }

    public abstract void dohvatiOpisUloge();
}

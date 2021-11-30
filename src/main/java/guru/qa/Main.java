package guru.qa;

public class Main {
    public static void main(String[] args) {
        Person one = new Person("Ivan","Nik",15);
        Person two = new Person("Bogdan","Osenuk",35);
        Person three = new Person("Oleg","Derabin",52);

        one.sayWho();
        two.sayWho();
        three.sayWho();

        one.myAge();
        two.myAge();
        three.myAge();
    }
}

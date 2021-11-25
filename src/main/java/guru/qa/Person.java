package guru.qa;

public class Person {
    String name;
    String surname;
    int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    void sayWho() {
        System.out.println("Привет! Меня зовут " + name + ". Моя фамилия " + surname + ". Мой возраст " + age + ".");
    }

    void myAge() {
        if (age <= 20) {
            System.out.println("Я еще молод!");
        }
        if (age > 20 & age < 50) {
            System.out.println("Пойдет!Я еще не стар!");
        }
        if (age >= 50) {
            System.out.println("Мне больше 50! :( ");
        }
    }
}


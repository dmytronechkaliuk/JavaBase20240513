package com.gmail.dmytronechkaliuk.homeworks.homework11;

public class PersonDescribe {
    public static void main(String[] args) {
        Person firstPerson = new Person("John", 30, "Engineer");
        Person secondPerson = new Person("Mary", 25, "Teacher");
        Person thirdPerson = new Person("Bob", 35, "Doctor");

        firstPerson.describe();
        secondPerson.describe();
        thirdPerson.describe();

        Person fourthPerson = new Person("Alice", 28, "Architect");
        fourthPerson.describe();

        System.out.println("After updating the profession: ");
        fourthPerson.updateJob("Designer");
        fourthPerson.describe();
    }
}

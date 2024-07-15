package com.gmail.dmytronechkaliuk.homeworks.homework11;

public class Person {
    String name;
    int age;
    String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public void describe() {
        System.out.printf("Name: %s, Age: %d, Job: %s\n", name, age, job);
    }

    public void updateJob(String job) {
        this.job = job;
    }
}

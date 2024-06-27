package com.gmail.dmytronechkaliuk.homeworks.homework12;

public class EmployeeDescribe {
    public static void main(String[] args) {
        Employee employee = new Employee("Dmytro Nechkaliuk", "Backend Developer", "0949321107d@gmail.com", "+380949321107", 18);

        System.out.printf("Name: %s, Job: %s, Email: %s, Phone: %s, Age: %d", employee.getName(), employee.getJob(), employee.getEmail(), employee.getPhone(), employee.getAge());
    }
}

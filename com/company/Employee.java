package com.company;

public class Employee {
    String name;
    String lastName;
    int salary;

    public Employee(String name, String lastName, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
    }

    public void getAllData() {
        System.out.println("Salary for " + name + " " + lastName + " is: " + salary);

    }

    public int getSalary() {
        return salary;
    }
}

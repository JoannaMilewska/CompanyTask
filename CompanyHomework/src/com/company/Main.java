package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Employee> employeeList= new ArrayList<>();
        employeesInfo(employeeList);

        boolean shouldDisplayMenu=true;

        while(shouldDisplayMenu){
            displayMenu();

            Scanner scanner=new Scanner(System.in);
            String menuOption = scanner.nextLine();

            switch(menuOption){
            case "1":
                getSumOfSalaries(employeeList);
                break;
            case "2":
                getInfoAboutCompany(employeeList);
                break;
            case "3":
                addNewEmployee(employeeList);
                break;
            case "4":
                System.out.println("Program will be closed");
               shouldDisplayMenu=false;
                break;
            default:
                System.out.println("Niepoprawna wartosc, wybierz ponownie ");
                break;
        }
       }

    }

    private static void addNewEmployee(ArrayList<Employee> employeeList) {
        System.out.println("Podaj dane pracownika, ktorego chcesz dodac do listy (imie, nazwisko, wyplata)");
        Scanner scanner1=new Scanner(System.in);
        String name = scanner1.nextLine();
        Scanner scanner2=new Scanner(System.in);
        String lastName=scanner2.nextLine();
        Scanner scanner3=new Scanner(System.in);
        int salary = scanner3.nextInt();
        Employee userEmployee= new Employee(name,lastName,salary);
        employeeList.add(userEmployee);
        System.out.println("dodano pracownika");
    }

    private static void getInfoAboutCompany(ArrayList<Employee> employeeList) {
        for (Employee employee: employeeList) {
           employee.getAllData();
        }
    }

    private static void getSumOfSalaries(ArrayList<Employee> employeeList) {
        int sum=0;
        for (Employee employee: employeeList) {
            sum+= employee.getSalary();
        }
        System.out.println("suma zarobkow wszystkich pracownikow to :"+sum);
    }

    private static void employeesInfo(ArrayList<Employee> employeeList) {
        Employee janKowalski=new Employee("Jan","Kowalski",1000 );
        employeeList.add(janKowalski);
        Employee maciejNowak=new Employee("Maciej","Nowak",2000 );
        employeeList.add(maciejNowak);
        Employee grazynaNowak=new Employee("Grazyna","Nowak",3200 );
        employeeList.add(grazynaNowak);
        Employee annaMazurek=new Employee("Anna","Mazurek",2100 );
        employeeList.add(annaMazurek);
        Employee mariaKowalska=new Employee("Maria","Kowalska",5500 );
        employeeList.add(mariaKowalska);
    }

    private static void displayMenu() {
        System.out.println("Choose one option:\n" +
                "1- Print sum of the employees salary\n" +
                "2- Display all employees data\n"+
                "3- Add new employee\n"+
                "4- End program");
    }
}

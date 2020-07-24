package com.company;

import java.util.Scanner;
public class EmployeeTest {
    public static void main(String args[]) {
        Employee empl1 = new Employee();
        Employee empl2 = new Employee();

        Scanner sc = new Scanner(System.in);
        String firstN;
        String lastN;
        double salary;

        System.out.println("Enter First Name of First Employee: ");
        firstN = sc.next();
        empl1.setfirstName(firstN);

        System.out.println("Enter Last Name of First Employee: ");
        lastN = sc.next();
        empl1.setlastName(lastN);

        System.out.println("Enter Monthly Salary of First Employee: ");
        salary = sc.nextDouble();
        empl1.setSalary(salary);

        System.out.println("Enter First Name of Second Employee: ");
        firstN = sc.next();
        empl2.setfirstName(firstN);

        System.out.println("Enter Last Name of Second Employee: ");
        lastN = sc.next();
        empl2.setlastName(lastN);

        System.out.println("Enter Monthly Salary of Second Employee: ");
        salary = sc.nextDouble();
        empl2.setSalary(salary);

        System.out.println("First Employee's Full Name and Yearly Salary.\n");
        System.out.println(empl1.getfirstName() + " " + empl1.getlastName() + "  " + empl1.getSalary() * 12 + "\n");

        System.out.println("Second Employee's Full Name and Yearly Salary.\n");
        System.out.println(empl2.getfirstName() + " " + empl2.getlastName() + "  " + empl2.getSalary() * 12 + "\n");

        System.out.println("Displaying New Total Annual Salary After 10% Raise.\n");
        System.out.println(empl1.getfirstName() + " " + empl1.getlastName() + "  " + (empl1.getSalary() * 1.10 * 12 + "\n"));
        System.out.println(empl2.getfirstName() + " " + empl2.getlastName() + "  " + (empl2.getSalary() * 1.10 * 12 + "\n"));
    }
}

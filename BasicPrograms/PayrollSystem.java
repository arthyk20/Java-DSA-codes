package com.arthy.BasicPrograms;
import java.util.Scanner;
public class PayrollSystem {
     String employeeName;
     double basicSalary;
     double hra;
     double da;
     double ma;
     double pf;
    public PayrollSystem(String name, double salary) {
        employeeName = name;
        basicSalary = salary;
        hra = 0.3 * basicSalary;
        da = 0.2 * basicSalary;
        ma = 0.1 * basicSalary;
        pf = 0.12 * basicSalary;
    }
    public double calculateSalary() {
        return basicSalary + hra + da + ma - pf;
    }
    public void displayPayroll() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("HRA: $" + hra);
        System.out.println("DA: $" + da);
        System.out.println("MA: $" + ma);
        System.out.println("PF: $" + pf);
        System.out.println("Net Salary: $" + calculateSalary());
    }
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter Employee name : ");
        String name = ob.nextLine();
        System.out.print("Enter Salary : ");
        double salary = ob.nextInt();
        PayrollSystem employee1 = new PayrollSystem(name, salary);
        employee1.displayPayroll();
    }
}
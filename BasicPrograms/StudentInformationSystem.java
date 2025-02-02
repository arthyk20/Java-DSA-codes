package com.arthy.BasicPrograms;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int id;
    private int age;
    private String address;
    private String phoneNumber;
    private String email;
    private double[] marks;
    public Student(String name, int id, int age, String address, String phoneNumber, String email) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.marks = new double[5];
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getEmail() {
        return email;
    }

    public double[] getMarks() {
        return marks;
    }

    public void setMarks(double[] marks) {
        if (marks.length == 5) {
            this.marks = marks;
        }
    }
    public String toString() {
        StringBuilder marksString = new StringBuilder("Marks: ");
        for (double mark : marks) {
            marksString.append(mark).append(" ");
        }

        return "ID: " + id + "\nName: " + name + "\nAge: " + age + "\nAddress: " + address + "\nPhone Number: " + phoneNumber + "\nEmail: " + email + "\n" + marksString.toString();
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Student s1 = new Student("John Doe", 101, 20, "123 Main St", "555-123-4567", "john.doe@example.com");
        Student s2 = new Student("Jane Smith", 102, 22, "456 Elm St", "555-987-6543", "jane.smith@example.com");
        Student s3 = new Student("Alice Johnson", 103, 21, "789 Oak St", "555-567-8901", "alice.johnson@example.com");
        Student s4 = new Student("Bob Brown", 104, 23, "321 Birch St", "555-234-5678", "bob.brown@example.com");
        Student s5 = new Student("Eva Williams", 105, 19, "654 Pine St", "555-876-5432", "eva.williams@example.com");
        s1.setMarks(new double[]
                {
                        90.5, 85.0, 78.5, 95.0, 88.5
                });
        s2.setMarks(new double[]
                {
                        75.5, 88.0, 92.5, 86.0, 79.5
                });
        s3.setMarks(new double[]
                {
                        85.0, 79.5, 92.0, 88.5, 90.0
                });
        s4.setMarks(new double[]
                {
                        78.0, 84.5, 89.0, 92.5, 87.0
                });
        s5.setMarks(new double[]
                {
                        92.0, 91.5, 85.5, 89.5, 94.0
                });

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
            System.out.println("\nStudent Information System Menu:");
            System.out.println("1. Display Students");
            System.out.println("2. Quit");
            System.out.print("Enter your choice (1/2): ");
            Scanner ob = new Scanner(System.in);
            int choice = ob.nextInt();

            switch (choice) {
                case 1:
                    if (students.isEmpty()) {
                        System.out.println("No students added yet.");
                    } else {
                        System.out.println("\nStudent Details:");
                        for (Student student : students) {
                            System.out.println(student);
                            System.out.println("---------------");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Exiting Student Information System.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
    }
}
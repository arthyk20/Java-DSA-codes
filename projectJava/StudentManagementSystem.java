 package com.arthy.projectJava;
 import java.util.ArrayList;
 import java.util.Scanner;
 class Student {
    private String name;
    private int rollNumber;
    private int[] attendance;
    private int[] marks;
    public Student(String name, int rollNumber, int numSubjects) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.attendance = new int[numSubjects];
        this.marks = new int[numSubjects];
    }
    public String getName() {
        return name;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public void markAttendance(int subjectIndex, int attendanceValue) {
        if (subjectIndex >= 0 && subjectIndex < attendance.length) {
            attendance[subjectIndex] = attendanceValue;
        }
    }
    public void setMarks(int subjectIndex, int marksValue) {
        if (subjectIndex >= 0 && subjectIndex < marks.length) {
            marks[subjectIndex] = marksValue;
        }
    }
    public double calculateAverageMarks() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (float) sum / marks.length;
    }
    public double calculateAttendancePercentage() {
        int totalClasses = attendance.length;
        int attendedClasses = 0;
        for (int att : attendance) {
            attendedClasses += att;
        }
        return (int) attendedClasses / totalClasses ;
    }
 }
 public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student name: ");
            String name = scanner.next();
            System.out.print("Enter roll number: ");
            int rollNumber = scanner.nextInt();
            students.add(new Student(name, rollNumber, numSubjects));
        }
        for (Student student : students) {
            System.out.println("Enter attendance for student " + student.getName() + " (roll number: " + student.getRollNumber() + "):");
            for (int i = 0; i < numSubjects; i++) {
                System.out.print("Attendance for subject " + (i + 1) + ": ");
                int attendanceValue = scanner.nextInt();
                student.markAttendance(i, attendanceValue);
            }
            System.out.println("Enter marks for student " + student.getName() + " (roll number: " + student.getRollNumber() + "):");
            for (int i = 0; i < numSubjects; i++) {
                System.out.print("Marks for subject " + (i + 1) + ": ");
                int marksValue = scanner.nextInt();
                student.setMarks(i, marksValue);
            }
        }
        // Calculate and display results
        for (Student student : students) {
            System.out.println("-------------------------------------");
            System.out.println("Student: " + student.getName());
            System.out.println("Roll Number: " + student.getRollNumber());
            System.out.println("Average Marks: " + student.calculateAverageMarks() +"%");
            System.out.println("Attendance Percentage: " + student.calculateAttendancePercentage() + "%");
            System.out.println();
        }
        scanner.close();
    }
}
package com.arthy;

import java.util.Scanner;

public class Nestedswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Empid = in.nextInt();
        String dip = in.next();
        switch (Empid){
            case 1:
                System.out.println("Arthy");
                break;
            case 2:
                System.out.println("Dinesh");
                break;
            case 3:
                System.out.println("Employe id 3");
                switch (dip) {
                    case "IT":
                        System.out.println("IT Dipartment");
                        break;
                    case "Management":
                        System.out.println("Management dipartment");
                        break;
                }
                break;
            default:
                System.out.println("Enter valid id");
        }
        switch (Empid) {
            case 1 -> System.out.println("Arthy");
            case 2 -> System.out.println("Dinesh");
            case 3 -> {
                System.out.println("Employee id 3");
                switch (dip) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                }
            }
            default -> System.out.println("Enter valid id");
        }
    }
}

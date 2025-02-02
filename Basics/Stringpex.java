package com.arthy;

import java.util.Scanner;

public class Stringpex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Any Input :");
//       String fruit = in.next();
//        switch (fruit) {
//            case "Mango" -> System.out.println("King of fruits");
//            case "Apple" -> System.out.println("A sweet red fruit");
//            case "Orange" -> System.out.println("Round fruit");
//            case "Grapes" -> System.out.println("Small Fruit");
//            default -> System.out.println("Please enter valid fruit");
//        }
        int day = in.nextInt();
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekdays");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Enter valid day");
                break;
        }
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Enter valid day");
        }
    }
}

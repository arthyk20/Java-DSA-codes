package com.arthy.BasicPrograms;

import java.util.Scanner;

public class AlphabetPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a digit (0-9): ");
        int digit = scanner.nextInt();
        
        if (digit >= 0 && digit <= 20) {
            StringBuilder result = new StringBuilder();
            
            for (char c = 'A'; c <= 'A' + digit; c++) {
                result.append(c);
            }
            
            System.out.println("Alphabets: " + result.toString());
        } else {
            System.out.println("Invalid input! Please enter a digit between 0 and 9.");
        }
        
        scanner.close();
    }
}
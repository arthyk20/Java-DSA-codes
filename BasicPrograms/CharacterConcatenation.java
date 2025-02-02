package com.arthy.BasicPrograms;

import java.util.Scanner;

public class CharacterConcatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();


        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        int minLength = Math.min(firstString.length(), secondString.length());
        int commonLength = 0;

        // Finding the length of the common substring
        for (int i = 0; i < minLength; i++) {
            if (firstString.charAt(firstString.length() - 1 - i) == secondString.charAt(i)) {
                commonLength++;
            } else {
                break;
            }
        }

        // Printing the common characters
        for (int i = 0; i < commonLength; i++) {
            System.out.print(firstString.charAt(firstString.length() - commonLength + i));
        }

        System.out.println(); // Print a newline at the end
    }
}




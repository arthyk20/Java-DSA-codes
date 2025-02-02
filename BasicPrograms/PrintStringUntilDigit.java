package com.arthy.BasicPrograms;

public class PrintStringUntilDigit {
    public static void main(String[] args) {
        String inputString = "abc123def456"; // Replace this with your input string

        // Iterate through the string
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);

            // Check if the current character is a digit
            if (Character.isDigit(currentChar)) {
                // If a digit is encountered before characters, break the loop
                break;
            }

            // Print the current character
            System.out.print(currentChar);
        }
    }
}

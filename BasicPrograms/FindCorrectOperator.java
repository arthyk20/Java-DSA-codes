package com.arthy.BasicPrograms;

public class FindCorrectOperator {
    public static void main(String[] args) {
        String operation = "5 * 3"; // Replace this with your input operation string
        double expectedAnswer = 15.0; // Replace this with the expected correct answer

        // Define the set of arithmetic operators to test
        char[] operators = {'+', '-', '*', '/'};

        // Iterate through each operator and calculate the result
        for (char operator : operators) {
            double result = evaluateOperation(operation, operator);

            // Check if the result matches the expected answer
            if (result == expectedAnswer) {
                System.out.println("Original Operation: " + operation);
                System.out.println("Correct Operator: " + operator);
                System.out.println("Correct Answer: " + expectedAnswer);
                break;
            }
        }
    }

        public static double evaluateOperation (String operation,char operator){
            String[] operands = operation.split("\\s*\\" + operator + "\\s*");
            double num1 = Double.parseDouble(operands[0]);
            double num2 = Double.parseDouble(operands[1]);

            switch (operator) {
                case '+':
                    return num1 + num2;
                case '-':
                    return num1 - num2;
                case '*':
                    return num1 * num2;
                case '/':
                    return num1 / num2;
                default:
                    throw new IllegalArgumentException("Invalid operator: " + operator);
            }
        }
    }








package com.arthy.BasicPrograms;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while(true) {
            System.out.println("Enter the operator:");
            char op = in.next().trim().charAt(0);
            System.out.println();
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%')  {
                System.out.println("Enter the 2 values");
                System.out.println();
                int a = in.nextInt();
                int b = in.nextInt();
                if (op == '+') {
                    ans = a + b;
                }
                if (op == '-') {
                    ans = a - b;
                }
                if (op == '*') {
                    ans = a * b;
                }
                if (op == '/') {
                    if (b != 0) {
                        ans = a / b;
                    }
                    else {
                        System.out.println("Not divisible by zero");
                    }
                }
                if (op == '%') {
                    ans = a % b;
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid operator");
            }
            System.out.println(ans);
        }
    }
}

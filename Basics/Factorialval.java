package com.arthy;

import java.util.Scanner;

public class Factorialval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(factorial(n));
    }
    static int factorial(int n){
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
}

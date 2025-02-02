package com.arthy;

import java.util.Scanner;

public class Functionsum {
    public static void main(String[] args) {
//        sum();
//        System.out.println(sum2());
        int  ans = sum3(8,9);
        System.out.println(ans);
    }
    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int num1 = in.nextInt();
        System.out.println("Enter 2st number:");
        int num2 = in.nextInt();
        int sum = num1+num2;
        return sum;

    }
   static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int num1 = in.nextInt();
        System.out.println("Enter 2st number:");
        int num2 = in.nextInt();
        int sum = num1+num2;
        System.out.println("Sum="+sum);

    }
}

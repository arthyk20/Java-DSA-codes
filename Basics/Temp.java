package com.arthy;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter tem in C:");
        float tempC= in.nextFloat();
        float tempF=(tempC*9/5)+32;
        System.out.println(tempF);

    }
}

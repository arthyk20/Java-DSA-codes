package com.arthy;

import java.util.Scanner;

public class Farenhiet {
    public static void main(String[] args) {
        float far, cel;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a value");
         far = in.nextFloat();
         cel = (far - 32) *5/9;
        System.out.println("The celcius ="+cel);
    }
}

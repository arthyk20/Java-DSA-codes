package com.arthy.BasicPrograms;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int a,b,c;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 numers");
        a = in.nextInt();
        b = in.nextInt();
        c = a;
        a = b;
        b = c;
        System.out.println( "After swapping:  " +a+ +b );
    }
}

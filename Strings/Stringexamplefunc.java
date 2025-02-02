package com.arthy.Strings;

import java.util.Scanner;

public class Stringexamplefunc {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your name");
        String name = in.next();
        String greeting = greating("Arthy");
        System.out.println(greeting);
    }

    private static String greating( String name) {
        String message = "Hello "+name;
        return message;

    }


    static String greet(){
     String greeting = "How are you";
     return greeting;
    }
}

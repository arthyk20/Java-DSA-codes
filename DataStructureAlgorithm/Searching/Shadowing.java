package com.arthy.DataStructureAlgorithm.Searching;

public class Shadowing {
    static  int a = 90;
    public static void main(String[] args) {
        System.out.println(a);
        int a ;
       // System.out.println(a);//scope wil begin when the value is initialized
        a = 40;
        System.out.println(a);
        fun();

    }

     static void fun() {
         System.out.println(a);
    }
}

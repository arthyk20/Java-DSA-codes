package com.arthy.Recurtion;

public class NumbersExample {
    public static void main(String[] args) {
        //write a functions that take a numbers and print it
        //print 5 numbers: 1 2 3 4 5
         printn1(1);
    }
    static void printn1(int n){
        System.out.println(n);
        printn2(2);
    }
    static void printn2(int n){
        System.out.println(n);
        printn3(3);
    }
    static void printn3(int n){
        System.out.println(n);
        printn4(4);
    }
    static void printn4(int n){
        System.out.println(n);
        printn5(5);
    }
    static void printn5(int n){
        System.out.println(n);
    }
}

package com.arthy.Recurtion;

public class NumbersExampleRecursion {
    public static void main(String[] args) {
        //write a functions that take a numbers and print it
        //print 5 numbers: 1 2 3 4 5
        print(1);
    }

    static void print(int n) {
        if (n > 5){
            return;
        }
        //this is called tail recursion
        //this is the last function call
        System.out.println(n);
        print(n + 1);
    }
}

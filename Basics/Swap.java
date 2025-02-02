package com.arthy;

public class Swap {
    public static void main(String[] args) {
        int a= 10;
        int b = 30;
        swap(a, b);
        System.out.print(a+ " " +b);
//        int temp = a;
//        b= a;
//        a = temp;
//        System.out.println( a+ " " + b);

    }
     static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;

         System.out.print(a+ " " +b);

     }
}

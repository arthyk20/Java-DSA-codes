package com.arthy;

public class FunctionOverloading {
    public static void main(String[] args) {
   fun(45);
   fun("Arthy");
   sum(2,3);
   sum(2,4,5);
   demo(3,4,5);
   demo("Arthy","ajgfu");
    }
    static void fun(int a){
        System.out.println(a);

    }
    static void demo(int...v){}
    static void demo(String...v){}
static void fun(String a){
    System.out.println(a);
}static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }
}

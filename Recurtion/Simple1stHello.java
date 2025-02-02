package com.arthy.Recurtion;

public class Simple1stHello {
    public static void main(String[] args) {
        Message();
    }
    static void Message(){
        System.out.println("Hello world");
        Message2();
    }
    static void Message2(){
        System.out.println("Hello world");
        Message3();
    }
    static void Message3(){
        System.out.println("Hello world");
        Message4();
    }
    static void Message4(){
        System.out.println("Hello world");
        Message5();
    }
    static void Message5(){
        System.out.println("Hello world");
    }
}

package com.arthy.BasicPrograms;

public class Privateacc {
    public static void main(String[] args) {
        A ob = new A();
//        System.out.println(ob.an);
//        ob.msg();
    }
}
class A{
    private int an = 30;
    private void msg(){
        System.out.println("Hello...");
    }
}

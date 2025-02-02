package com.arthy.BasicPrograms;

abstract  class  Bike{
    final int a = 20;
    void display(){
        System.out.println("Welcome");

    }
    abstract void run();
}
public  class Abstract extends Bike {
     void run(){
        System.out.println("Running");
    }

    public static void main(String[] args) {
        Bike ob = new Abstract();
        ob.run();
        ob.display();
       }
}


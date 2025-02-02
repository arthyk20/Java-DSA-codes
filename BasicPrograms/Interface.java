package com.arthy.BasicPrograms;

interface Drawable{
    void draw();
}
class Rectangle implements Drawable{
    public void draw(){
        System.out.println("Rectangle");
    }
}
class Circle implements Drawable{
    public void draw(){
        System.out.println("Circle");
    }
}
public class Interface {
    public static void main(String[] args) {
        Drawable d = new Rectangle();
        d.draw();
    }
}

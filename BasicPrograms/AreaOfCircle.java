package com.arthy.BasicPrograms;

public class AreaOfCircle {
    public static void main(String[] args) {
        int n = 23;
        Area(n);
        Triangle(20,12);

    }
    static void Area(int n){
        float ans = 3.14f * n*n;
        System.out.println("Area " +ans);
    }
    static void Triangle(int height, int base){
        float ans = (height * base)/2;
        System.out.println(ans);
    }
}

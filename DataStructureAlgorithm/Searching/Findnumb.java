package com.arthy;

public class Findnumb {
    public static void main(String[] args) {
        int n = 57457787;
        int count=0;
        while (n>0){
            int rem=n%10;
            if(rem==5){
                count++;
            }
            n=n/10;
        }
        System.out.println("Number of accurence:"+count);
    }
}

package com.arthy;

import java.util.Arrays;

public class Varlength {
    public static void main(String[] args) {
     fun(2,3,4,6,4,3,2,3);
     multiple(12,43,"Arthy","dinesh","baby");
    }
    static void multiple(int a, int b, String...c){
        System.out.println(a+" "+b+ " " +Arrays.toString(c));
    }
    static void fun(int...a){//(String..a)
        System.out.println(Arrays.toString(a));


    }
}

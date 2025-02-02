package com.arthy;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
//        float num= input.nextFloat();
//        System.out.println(num);
        //type casting
//        int num = (int) (56.78f);
//        System.out.println(num);
            byte b=42;
            char c= 'a';
            short s= 1082;
            int i=767;
            float f=78.98f;
            double d=5677.098;
            double result=(f*b)+(i/c) / (s*d);
        System.out.println((f*b)+"  "+(i/c)+"  " + (s*d));
        //float+int/double=double
        System.out.println(result);

    }
}

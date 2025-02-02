package com.arthy;

import java.util.ArrayList;

public class OperatorsString {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println((char) 'a' + 3);
        System.out.println("Arthy" + new ArrayList<>());
        System.out.println("a" + 1);
        System.out.println("Arthy" + new Integer(45));
      //  System.out.println(new Integer(45) + new ArrayList<>());
        System.out.println(new Integer(45) + ""+new ArrayList<>());

        String ans = new Integer(49) +" " + new ArrayList<>();
        System.out.println(ans);

    }
}

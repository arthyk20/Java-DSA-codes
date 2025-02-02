package com.arthy.Strings;


import java.util.Arrays;

 public class Method {
    public static void main(String[] args) {
        String name = "Arthy K";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('t'));
        System.out.println(  "     arthy  dinesh hello world   ".strip());
        System.out.println(Arrays.toString("arthy  dinesh hello world".split(" ")));
        System.out.println(name.charAt(3));
//        System.out.println(msg())
    }
   public static void msg(){
        System.out.println("Helloo");
    }
}

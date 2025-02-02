package com.arthy.BasicPrograms;

public class PrintCharForNumb {
    public static void main(String[] args) {
        String str = "2a5m";
        for (int i = 0; i < str.length(); i+=2) {
            int j = 1;
            int limit = str.charAt(i);
                while (j <= limit ){
                    System.out.println(str.charAt(i+1));
                    j++;
                }
        }
    }
}

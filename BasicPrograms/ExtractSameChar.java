package com.arthy.BasicPrograms;

public class ExtractSameChar {
    public static void main(String[] args) {
        String letter = "Monday";
        String letter2 = "dayend";
        int result = 0;
        for (int i = 0; i < letter2.length(); i++) {
          if (letter2.charAt(i) == letter.charAt(letter.length()-1)){
              result = i;
              break;
          }
        }
        System.out.println("Repeated = "+letter2.substring(0,result));

    }
}

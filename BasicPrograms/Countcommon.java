package com.arthy.BasicPrograms;

public class Countcommon {
    public static void main(String[] args) {
        String str1 = "banana";
        String str2 = "ravanan";
        int count = 0;
        for(char i = 'a'; i <='z'; i++){
            if ((str1.indexOf(i) != -1) && (str2.indexOf(i) != -1)){
                count++;
            }
        }
        System.out.println(count);
    }
}

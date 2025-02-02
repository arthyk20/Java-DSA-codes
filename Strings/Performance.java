package com.arthy.Strings;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);// it is in integer so we converted into char
            System.out.print(ch);
            series = series + ch;//series += ch
        }
        System.out.println(series);
    }
}

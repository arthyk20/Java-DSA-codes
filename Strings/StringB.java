package com.arthy.Strings;


public class StringB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder.toString());


        builder.replace(2,3,"'a','b'");
        System.out.println(builder);
    }
}

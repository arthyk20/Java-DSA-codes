package com.arthy.BasicPrograms;

public class CountWordVowel {
    public static void main(String[] args) {
        String name = "Java Programming";
        int count = 0;
        int vowel = 0;
        int constr = 0;
        name = name.toLowerCase();
        count = name.isEmpty() ? 0 : name.split(" ").length;
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u'){
                vowel++;
            }
//            if(name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u'){
//                continue;
//            }
            else {
                constr++;
            }

        }
        System.out.println("Number of words:" +count);
        System.out.println("Number of vowels:" +vowel);
        System.out.println("Number of consonents:" +constr);


    }
}

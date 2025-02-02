package com.arthy.BasicPrograms;

public class Palindrome {
    public static void main(String[] args) {

    }
    public boolean isPalindrome(int x) {
        int original = x;
        int sum = 0;
        while (x > 0) {
            int rem = x % 10;
             sum = (sum * 10) + rem;
            x = x / 10;
        }
        if (sum == original){
            return true;
        }
        return false;
    }
}

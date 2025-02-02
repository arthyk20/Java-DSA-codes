package com.arthy;
public class Revnum {
    public static void main(String[] args) {
        int n = 67845;
        int ans = 0;
        while (n > 0){
            int rem = n % 10;
            System.out.print(rem);
            n = n/10;
        }
        while (n > 0){
           int rem = n % 10;
           ans = ans * 10 + rem;
           n /= 10;
        }
        System.out.println(ans);
    }
}
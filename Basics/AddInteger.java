package com.arthy;

import java.util.Scanner;

public class AddInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a value:" );
        int num = in.nextInt();
        System.out.println(Addinteger(num));
    }
    static int Addinteger(int num) {
        int ans = 0;
        if (num >= 0 && num < 1000) {
            while (num > 0) {
               int rem = num % 10;
               ans =ans +rem;
                num = num / 10;
            }
        }
        return ans;
    }
    }

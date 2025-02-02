package com.arthy.BitWiseLogic;

public class PowerOF2 {
    public static void main(String[] args) {
        int n = 19;
        boolean ans = ( n & (n-1)) == 0;
        System.out.println(ans);
    }
}

package com.arthy.BitWiseLogic;

public class SetBit {
    public static void main(String[] args) {
        int n = 45;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(SetBits(n));
    }

    private static int SetBits(int n) {
        int count = 0;
//        while (n > 0){
//            count ++;
//            n -= (n & -n);
//        }
        while (n >0){
            count++;
            n = n & (n-1);
        }
        return count;
    }
}

package com.arthy.BitWiseLogic;

public class findithBit {
    public static void main(String[] args) {
        int n = 10010111;
        System.out.println(Find(n));
    }
    static int Find(int n){
         int ans = n & (1<<4);
        return ans;
    }
}

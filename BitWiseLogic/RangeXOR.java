package com.arthy.BitWiseLogic;

public class RangeXOR {
    public static void main(String[] args) {
        //range XOR for a, b = xor(b) ^ xor(a-1)
        int a = 3;
        int b = 9;
        int ans = Xor(b) ^ Xor(a-1);
        System.out.println(ans);
    }
    //this gives xor from 0 tll a
    static int Xor(int a){
        if (a % 4 == 0){
            return a;
        }
        if (a % 4 == 1){
            return 1;
        }
        if (a % 4 == 2){
            return a+1;
        }
        return 0;
    }
}

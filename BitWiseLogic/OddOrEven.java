package com.arthy.BitWiseLogic;

public class OddOrEven {
    public static void main(String[] args) {
        int n = 20456;
        System.out.println(odd(n));
    }
    static boolean odd( int n){
        return (n & 1) == 0;
}

}

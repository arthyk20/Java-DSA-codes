package com.arthy.BitWiseLogic;

public class FindUniqe {
    public static void main(String[] args) {
        int[] arr = {1,3,1,2,3,2,5, 6,5};
        System.out.println(ans(arr));
    }
    static int ans(int[] arr){
        int unique = 0;
        for (int n : arr) {
            unique ^= n;
        }
        return unique;
    }
}

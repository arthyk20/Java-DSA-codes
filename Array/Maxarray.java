package com.arthy.Array;

public class Maxarray {
    public static void main(String[] args) {
        int[] arr = {2,43,5,67,8};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > maxVal)
            {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}

package com.arthy;

public class Finmin {
    public static void main(String[] args) {
        int[] arr = {9,43,6,5,27,8};
        System.out.println(minimum(arr));
    }
    //assume arry is not empty
    static int minimum(int[] arr){
        int ans = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] < ans){
                ans = arr[i];
            }

        }
        return ans;
    }
    static int max(int[] arr){
        int ans = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] > ans){
                ans = arr[i];
            }

        }
        return ans;
    }
}

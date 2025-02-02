package com.arthy.Recurtion;

public class BSWithRecursion {
    public static void main(String[] args) {
        int [] arr = {2,4,6,7,8,9};
        int target = 9;
        System.out.println(search(arr, target, 0, arr.length-1));
    }
    static int search(int[] arr, int target, int s, int e){
        if(s >e){
            return -1;
        }
        int m = s + (e - s)/2;
        if (arr[m] == target ){
            return m;
        }
        if (target > arr[m]){
            return search(arr, target, m + 1, e);
        }
        else {
            return search(arr, target, s, m-1);
        }
    }
}

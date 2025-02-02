package com.arthy;

import java.util.Arrays;

public class Searchin2Darray {
    public static void main(String[] args) {
        int [][] arr = {
                {23,43,54},
                {2,43,6,8,9},
                {56,34,9},
                {2,4}
        };
        int target = 34;
        int[] ans = search(arr, target);
        //System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }
    static int[] search(int [][] arr ,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
            
        }
        return new int[]{-1, -1};
    }
    static int max(int [][] arr ){
        //int max= arr[0][0];
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }

        }
        return max;
    }
}

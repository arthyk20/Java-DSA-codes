package com.arthy.DataStructureAlgorithm.Searching;

import java.util.Arrays;

public class MissingNumbercyclic {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        int ans = missingNumber(nums);
        System.out.println(ans);
    }
    static int missingNumber(int[] nums) {
        cyclic(nums);
        for (int i = 0; i <= nums.length; i++) {
            if (i != nums[i]){
                return i;
            }

        }
        return nums.length;
    }
    static void cyclic(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;

            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

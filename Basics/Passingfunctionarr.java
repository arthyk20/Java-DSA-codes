package com.arthy;

import java.util.Arrays;


public class Passingfunctionarr {
    public static void main(String[] args) {
        int[] nums = {2,4,5,6,8};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void change(int[] arr)
    {
        arr[0] = 34;
    }
}

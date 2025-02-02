package com.arthy.DataStructureAlgorithm.Searching;

public class Leniar {
    public static void main(String[] args) {
        int[] num = {2,43,65,87,5,3,7,};
        int target = 2;
        boolean ans = linearsearch3(num , target);
        System.out.println(ans);
    }
    static boolean linearsearch3(int[] arr, int target) {
        if (arr.length == 0){
            return false;
        }
        for (int element : arr) {
            if (element == target) {
                return true;
            }

        }
        return false;
    }
    static int linearsearch2(int[] arr, int target) {
        if (arr.length == 0){
            return Integer.MAX_VALUE;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target){
                return element;
            }

        }
        return Integer.MAX_VALUE;
    }

    static int linearsearch(int[] arr, int target) {
        if (arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target){
                return index;
            }

        }
        return -1;
    }
}

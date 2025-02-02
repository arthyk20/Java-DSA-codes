package com.arthy.DataStructureAlgorithm.Sorting;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]){
                    swap(arr, j-1, j);
                }
                else {
                    break;
                }
            }
        }
    }

    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //find the max item in the remaining array and swap with correct index
            int last = arr.length - i -1;
            int max = getMaxIndex(arr, 0 , last);
            swap(arr, max, last);
        }
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void bubbleSort(int[] arr){
        boolean swapped;
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //for each steps max item will come at the last index
            for (int j = 1; j < arr.length-i; j++) {
                //swapp if the item is smaller than the previous item
                if(arr[j]< arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //if you did not swap for a particular value of i it means the array is sorted hence stop the program
            if (!swapped){ // !false = true
                break;
            }
        }


    }
}

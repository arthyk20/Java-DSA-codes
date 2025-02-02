package com.arthy.Array;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr ={3,5,6,8,9,12,16,19,25,28,37,45,67};
        int target = 16;
        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr, int target){
        //first find range
        //first start with the obox of 2
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int temp = end + 1; //this is my new start
            //double the box value
            //end = previos end + sizeofbox*2
            end = end +(end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid =start + (end - start)/2;
            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}

package com.arthy.DataStructureAlgorithm.Searching;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,9,5,3,1};
        int target = 0;
        int peak = peakEle(arr);
        int firstHalf = findInMount(arr, target, 0, peak);
        if (firstHalf != -1) {
            System.out.println(firstHalf);
        }
        else{
            System.out.println(findInMount(arr, target, peak+1, arr.length-1));
        }
    }
    static int findInMount(int[]arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end -start)/2;
            if (target == arr[mid]){
                return mid;
            }
            if (target > arr[mid]){
                start = mid +1;
            }
            else {
                end = mid -1;
            }
        }
        return -1;
    }
    static int peakEle(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            }
            else  {
                start = mid + 1;
            }
        }
      return start;
    }
}

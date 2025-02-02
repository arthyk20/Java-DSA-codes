package com.arthy.DataStructureAlgorithm.Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] bin = {-12,-5,-1,0,5,10,15,18,21,56,78};
        int target = 15;
        int ans = search(bin,target);
        System.out.println(ans);

    }
    static  int search(int[] nums, int target) {
        int s = 0;
        int e = nums.length -1;
        while(s <= e){
           int m = s + (e-s)/2;
            if(target < nums[m]){
                e = m - 1;
            }
            else if(target > nums[m]){
                s = m + 1 ;
            }
            else {
                return m;
            }
        }
        return -1;
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
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

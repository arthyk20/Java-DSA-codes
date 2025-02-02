package com.arthy.DataStructureAlgorithm.Searching;

public class Add {
    public static void main(String[] args) {

    }
    public  int[] twoSum( int[] nums, int target) {
        for(int i=0 ; i <nums.length-1; i++)
        {
            for (int j = 1; j < nums.length; j++) {
                while((nums[i]+nums[j]) == target)
                {
                    return new int[] {i, j};
                }
            }

        }
        return new int[] {-1, -1};
    }

    public static class Mountainarray {
        public static void main(String[] args) {

        }
        public int peakIndexInMountainArray(int[] arr) {
         int start = 0;
         int end = arr.length-1;
         while(start<end){
             int mid = start +(end - start )/2;
             if(arr[mid] > arr[mid+1]){
                 //you are in decreasing part
                 //it may e the answer, but look at left
                 //this is why end is not end - 1
                 end = mid;
             }
             else {
                 start =mid+1; //bcz we kow that mid+1 is greater than mid element

             }
         }
         //in the end start == end and pointing the largest element
            return start; //or return end cuz both are equal
        }
    }
}

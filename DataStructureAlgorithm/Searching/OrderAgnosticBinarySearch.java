package com.arthy.DataStructureAlgorithm.Searching;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] bin = {95,84,45,32,21,13,6,3,2,-2,-5};
        int target = 95;
        int ans = Orderag(bin,target);
        System.out.println(ans);
    }
    static int Orderag(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAss = arr[start] < arr[end];
        while (start <= end){
            int mid =start + (end - start)/2;
            if (arr[mid] == target){
                return mid;
            }
           if (isAss){
               if (target < arr[mid]){
                   end = mid - 1;
               } else {
                   start = mid + 1;
               }
           }
           else {
               if (target > arr[mid]){
                   end = mid - 1;
               } else  {
                   start = mid + 1;
               }
           }
        }
        return -1;
    }
}

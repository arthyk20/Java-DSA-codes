package com.arthy;
public class Searchinmountain {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,7,5,3,1};
        int target = 7;
        int ans = search(arr,target);
        System.out.println(ans);
    }
    static int search(int[]arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = Orderag(arr, target, 0, peak);
        if (firstTry != -1){
            return firstTry;
        }
        return Orderag(arr, target, peak+1, arr.length-1);
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                //you are in decreasing part
                //it may e the answer, but look at left
                //this is why end is not mid - 1
                end = mid;
            } else {
                start = mid + 1; //bcz we kow that mid+1 is greater than mid element

            }
        }
        //in the end start == end and pointing the largest element
        return start; //or return end cuz both are equal
    }
    static int Orderag(int[] arr, int target, int start, int end){

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

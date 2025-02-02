package com.arthy.DataStructureAlgorithm.Searching;

public class RotatedbinarySearch {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(findPivot(nums));
    }
    static int search(int[] nums, int target) {
        int pivot = findPivotForDuplicate(nums);
        if (pivot == -1){
            //just do normal binary search
            return binarySearch(nums, target,0,nums.length-1);
        }
        //if pivot is found, you have to find to asc arrays
        if (nums[pivot] == target){
            return pivot;
        }
        if (target >=nums[0]){
            return binarySearch(nums, target, 0,pivot - 1);
        }
        //if (target <= nums[0]){
            return binarySearch(nums, target, pivot+1, nums.length-1);
        //}
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
    //this will not work for duplicate value
    static int findPivot(int[]arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            //4 cases over here
            int mid = start +(end-start)/2;
            if (mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid -1]) {
                return mid-1;
            }
            //case 3
            if(arr[mid] <=arr[start]){
                end = mid -1;
            }else {//start is less than mid then start = mid+1
                start = mid + 1;
            }
        }
        return -1;
    }
    static int findPivotForDuplicate(int[]arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            //4 cases over here
            int mid = start +(end-start)/2;
            if (mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid -1]) {
                return mid-1;
            }
            //if elemets at middle, start, end are equal just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]){
                //skip the dublicates
               // NOTE= what if these element at start and end  were the pivot?
                //ckeck if start is pivot
                if (arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                //ckeck wherether end is pivot
                if (arr[end] < arr[end-1]) {
                    return end-1;
                }
                end--;
            }
            //left side is sorted pivot should be in right
            else if (arr[start]<arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]){
              start = mid+1;
            }
            else {
                end = mid - 1;
            }


        }
        return -1;
    }
}

package com.arthy.DataStructureAlgorithm.Searching;

public class Rotationcount {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(countRotation(nums));
    }

    private static int countRotation(int[] nums) {
        int pivot = findPivotForDuplicate(nums) + 1;
        return pivot;

    }
    //use this for duplicate
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
    // use this for non duplicates
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

}

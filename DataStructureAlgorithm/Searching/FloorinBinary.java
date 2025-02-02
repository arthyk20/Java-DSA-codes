package com.arthy.DataStructureAlgorithm.Searching;

public class FloorinBinary {
    public static void main(String[] args) {
        int[] bin = {-12,-5,-1,0,5,10,15,18,21,56,78};
        int target = 23;
        int ans = Floor(bin,target);
        System.out.println(ans);
}

    static int Floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (target > arr[arr.length-1]){
            return -1;
        }

        while (start <= end){
            int mid =start + (end - start)/2;

            if (target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else if(target == arr[mid]) {
                return arr[mid];
            }

        }
        return arr[end];
    }
    }

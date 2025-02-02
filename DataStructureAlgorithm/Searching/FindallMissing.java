package com.arthy;

import java.util.ArrayList;
import java.util.List;

public class FindallMissing{
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;

            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (index +1 != nums[index]){
                ans.add(index +1 );
            }
        }
        return ans;
    }
     void cyclic(int[] nums){

    }

     void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static class SetMismatch {
        public int[] findErrorNums(int[] nums) {
            int i = 0;
            while (i < nums.length) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    i++;

                }
            }

            for (int index = 0; index < nums.length; index++) {
                if (nums[index] != index +1){
                    return   new int[] {nums[index], index+1};
                }
            }
            return new int[]{-1,-1};
        }
        void swap(int[] arr, int first, int second) {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
    }
}

package com.arthy.DataStructureAlgorithm.Searching;

import java.util.ArrayList;
import java.util.List;

class Solution {
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


        void swap(int[] arr, int first, int second) {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
    }

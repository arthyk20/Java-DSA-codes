package com.arthy;

public class Searchinrange {
    public static void main(String[] args) {
        int[] num = {2,43,65,87,5,3,7,};
        int target = 65;
        int ans = linearsearch(num , target, 1, 4);
        System.out.println(ans);
    }
    static int linearsearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0){
            return -1;
        }
        for (int index = start; index < end; index++) {
            int element = arr[index];
            if (element == target){
                return index;
            }

        }
        return -1;
    }
}

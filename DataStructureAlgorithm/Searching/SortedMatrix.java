package com.arthy.DataStructureAlgorithm.Searching;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int [][] arr= {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(search(arr, 3)));

    }
    static int[] BinarySformatrix(int[][] matrix, int row, int cStart, int cEnd, int target){
    while (cStart <= cEnd){
        int mid = cStart +(cEnd - cStart)/2;
        if(matrix[row][mid] == target){
            return new int[] {row,mid};
        }
        if(matrix[row][mid] < target){
            cStart = mid +1;
        }else {
            cEnd = mid -1;
        }
    }
        return new int[] {-1,-1};
    }
    static int[] search(int[][]matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;//be conscious matrix may bbe empty
        if(rows == 1){
            return BinarySformatrix(matrix, 0, 0,cols-1, target);
    }
        int rStart = 0;
        int rEnd = rows -1;
        int cmid = cols/2;
     //run the loop till two rows are remaining
        while (rStart < (rEnd - 1)){
            int rmid = rStart + (rEnd - rStart)/2;
            if (matrix[rmid][cmid] == target){
                return new int[]{rmid, cmid};
            }
            if (matrix[rmid][cmid] < target){
                rStart = rmid;
            }
            if (matrix[rmid][cmid] > target){
                rEnd = rmid;
            }
        }
        //now we have two rows
        //check whether the target is in col of two rows
        if (matrix [rStart][cmid] == target){
            return new int[] {rStart, cmid};
        }
        if (matrix [rStart + 1][cmid] == target){
            return new int[] {rStart + 1, cmid};
        }
        //search in 1st half
        if (target <= matrix[rStart][cmid - 1]){
            return BinarySformatrix(matrix, rStart, 0, cmid-1, target);
        }
        //search in 2nd half
        if (target >= matrix[rStart][cmid + 1] && target <= matrix[rStart][cols -1]){
            return BinarySformatrix(matrix, rStart, cmid+1, cols - 1, target);
        }
        //search in 3rd half
        if (target <= matrix[rStart + 1][cmid - 1]){
            return BinarySformatrix(matrix, rStart + 1, 0, cmid - 1, target);
        }
        //search in 4th half
       else {
            return BinarySformatrix(matrix, rStart+1, cmid+1, cols - 1, target);
        }
}
}


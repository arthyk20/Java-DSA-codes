package com.arthy.Array;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class Multidimentionarr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        1 2 3
        4 5 6
        7 8 9
         */
        int [][] arr = new int [3][3];
//       int [] [] arr2D = {
//                {1,2,3},//0th index
//               {4,5}, // 1st
//              {6,7,8,9} //2nd
//        };
        //input
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        //output
        for(int[] a : arr){
            System.out.println(Arrays.toString(arr));
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();

        }

    }
}

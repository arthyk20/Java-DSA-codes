package com.arthy.Array;

import java.util.Arrays;
import java.util.Scanner;


public class Array {
    public static void main(String[] args) {
        //syntax
        // int[] rollno = new int[50];
        //or
        //  int[] rolln = {23,43,12,34,56};
        // primitives
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0]=4;
        arr[1]=2;
        arr[2]=65;
        arr[3]=45;
        arr[4]=44;

//        for (int i = 0; i < 5; i++) {
//            arr[i] = in.nextInt();
//        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
      //  System.out.println(arr); we should not print like this should only print on string
        System.out.println(Arrays.toString(arr));
        for (int ele : arr){
            System.out.println(ele);
        }
   //arrays of objects
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str) );

    }


}

package com.arthy.Strings;

public class Pattern {
    public static void main(String[] args) {
        Pattern31(4);
    }
    static void Pattern31(int n){
        int OriginalN = n;
        n = 2 *n;
        for (int row = 1; row <= n ; row++) {

            for (int col = 1; col <=n ; col++) {
                int atEveryIndex = OriginalN - (Math.min(Math.min(row, col), Math.min(n - row, n - col)));
                System.out.print(atEveryIndex+ " ");
            }
            System.out.println();
        }
    }
    static void Pattern30(int n) {
        for (int row = 1; row <= n; row++) {
            //for every row, run the colm
            for (int spaces = 0; spaces <= n-row; spaces++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col +" ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col +" ");
            }
            System.out.println();
        }

    }
    static void Pattern28(int n) {
        for (int row = 1; row <= 2*n; row++) {

            //for every row, run the colm
            int TotalRowInCol = row > n ? 2 * n -row  : row;
            int NoOfSpaces = n - TotalRowInCol;
            for (int s = 0; s < NoOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=TotalRowInCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    static void Pattern5(int n) {
        for (int row = 1; row <= 2*n; row++) {
            //for every row, run the colm
             int TotalRowInCol = row > n ? 2 * n -row  : row;
                 for (int col = 1; col <=TotalRowInCol; col++) {
                     System.out.print("* ");
                 }
            System.out.println();
             }

                }
    static void Pattern1(int n){
        for (int row = 1; row <= n; row++) {
            //for every row, run the colm
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            //when one row is printed we need to add new line
            System.out.println();
        }

    }
    static void Pattern2(int n){
        for (int row = 1; row <= n; row++) {
            //for every row, run the colm
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            //when one row is printed we need to add new line
            System.out.println();
        }

    }
    static void Pattern3(int n){
        for (int row = 1; row <= n; row++) {
            //for every row, run the colm
            for (int col = 1; col <= n-row+1; col++) { // 5-1+1 total - row +1
                System.out.print("* ");
            }
            //when one row is printed we need to add new line
            System.out.println();
        }

    }
    static void Pattern4(int n){
        for (int row = 1; row <= n; row++) {
            //for every row, run the colm
            for (int col = 1; col <= row; col++) {
                System.out.print( col +" ");
            }
            //when one row is printed we need to add new line
            System.out.println();
        }

    }
}

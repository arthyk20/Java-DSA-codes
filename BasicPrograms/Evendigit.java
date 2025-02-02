package com.arthy.BasicPrograms;

public class Evendigit {
    public static void main(String[] args) {
        int[] arr = {234, 21, 54, 76765, 2234};
        System.out.println(findnumeber(arr));
        System.out.println(digits2(56887));

    }

    static int findnumeber(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numberofdigit = digits(num);
        if (numberofdigit % 2 == 0) {
            return true;
        }
        return false;
    }
static int digits2(int num){
    if (num<0){
        num = num* -1;
    }
        return (int)(Math.log10(num))+1;
}
    static int digits(int num) {
        if (num<0){
            num = num* -1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
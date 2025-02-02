package com.arthy.BasicPrograms;

public class Amstrongnumebre {
    public static void main(String[] args) {
        for (int i = 100; i <1000 ; i++) {
            if (isAmstrong(i)){
                System.out.println(i + " ");
            }
            
        }
        System.out.println(isAmstrong(153));
    }
    static boolean isAmstrong(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum = sum + rem*rem*rem;
            n/=10;
        }
        return sum == original ;
    }
}

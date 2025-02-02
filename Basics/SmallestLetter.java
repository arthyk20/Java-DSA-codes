package com.arthy;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] letter = {'c','f','k','m','r'};
        char target = 'k';
        char ans = nextGreatestLetter(letter,target);
        System.out.println(ans);

    }


    static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
            int end = letters.length - 1;
            if (target > letters[letters.length-1]){
                return 'N';
            }

            while (start <= end){
                int mid =start + (end - start)/2;

                if (target < letters[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            return letters[start];
        }


}

package com.arthy.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylistexam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(67);
//        list.add(567);
//        list.add(67);
//        list.add(567);
//        list.add(67);
//        list.add(567);
//        list.add(67);
//        list.add(567);
//        System.out.println(list.contains(67));
//        list.set(2,78);
//        list.remove(5);
        for (int i = 0; i <6 ; i++) {
            list.add(in.nextInt());
        }
        for (int i = 0; i <6 ; i++) {
            System.out.println(list.get(i));//list[index] syntax will not work here
        }
        System.out.println(list);
    }
}

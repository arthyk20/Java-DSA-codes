package com.arthy.BasicPrograms;

import java.util.Arrays;

public class IdentifyCorrectOperator {
    public static void main(String[] args) {
        String equ = "20/5=4";
        String parts[] = equ.split("=");
        int result = Integer.parseInt(parts[1]);
        if (parts.length != 2){
            System.out.println("Null value");
        }
        else {
            String[] leftoperent = parts[0].split("[//+//-//*///]");
            if(leftoperent.length != 2) {
                System.out.println("Null");
            }
                else{
                int n1 = Integer.parseInt(leftoperent[0]);
                int n2 = Integer.parseInt(leftoperent[1]);
                char op[] = {'+', '-', '*', '/','%'};
                for (int i = 0; i < op.length; i++) {
                    int temp = 0;
                    char opr = op[i];
                    switch (opr) {
                        case '+':
                            temp = n1 + n2;
                            break;
                        case '-':
                            temp = n1 - n2;
                            break;
                        case '*':
                            temp = n1 * n2;
                            break;
                        case '/':
                            if (n2 != 0)
                                temp = n1 / n2;
                            break;
                        case '%':
                            temp = n1 + n2;
                            break;
                    }
                    if (temp == result){
                        System.out.println(op[i]);
                        break;
                    }
                }
            }
        }
    }
}

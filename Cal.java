package com.sayan;

import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        Scanner in = new Scanner ( System.in );
        int ans = 0;
        while (true){
            System.out.println ("put operator");
            char op = in.next ().trim ().charAt ( 0);

            if (op== '+'|| op=='-'|| op =='*'|| op == '%'|| op == '/'){
                System.out.println ("1st digit");
                int num1 = in.nextInt ();
                System.out.println ("2nd digit");
                int num2 = in.nextInt ();

                if (op == '*'){
                    ans = num1 *num2;
                }
                if(op == '+'){
                    ans = num1 + num2;
                }
                if (op == '-'){
                   ans = num1 - num2;
                }
                if (op == '/'){
                    if (num2 !=0){
                        ans = num1 / num2;
                    }
                }
                if (op == '%'){
                    if (num2>num1 || num2 != 0){
                        System.out.println ("Divider never be grater or ZERO ");
                        ans = num1 % num2;
                    }
                }
                    else  if (op == 'X' || op == 'x'){
                        break;
                }
            }else {
                System.out.println ("Invalid operation");
            }
            System.out.println ("Ans :" + ans);
        }
    }
}
// For handling  exception , I've not use try , catch .

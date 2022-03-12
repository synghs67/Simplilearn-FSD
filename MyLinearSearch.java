package com.Sayan;

import java.util.Scanner;

public class MyLinearSearch {
    public static void main(String[] args) {
        //Variable declaration
        int[] data = new int [] {1,4,5,89,33,444,12,56,444,5};
        boolean isFound = false;
        int input;
        // Take input form user
        Scanner obj = new Scanner ( System.in );
        System.out.println ("Enter any number");
        input= Integer.parseInt ( obj.nextLine ());

        // logic 
        for (int i = 0; i<data.length;i++){
            if (data[i] == input){
                System.out.println ("Number is at " + (i+1)+ " position"); // Declare i+1 for position the data to user
                isFound = true;
                break; // use for tell the data first index; Break remove then it'll tell me where is duplicate data

            }
        }
        if ( isFound = false);{
            System.out.println ("Element not found");
        }


    }
}

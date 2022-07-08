package com.company.Wow;

import java.lang.Math;

public class Array {
    public static void main(String[] args) {

        int[] roll = new int[]{1,3,55,32,55,111};
        for(int i=0 ;i<roll.length;i++){
            System.out.println(i+" th index is "+roll[i]);

        }

        System.out.println("\nNow this is the 2nd type of array making\n");

        int arr[];
        arr =new int[5];
        for(int i =0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*100);
            System.out.println(arr[i]);
        }




    }
}

package com.company.Wow;

import java.util.Arrays;
import java.util.Scanner;

public class IncreasingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {11,8,20,6,5,-6};
//        int[] arr2 =new int[]{-1};
//        System.out.println(Arrays.toString(arr2));
        System.out.println(reverse(arr));
    }
    private static String reverse(int[] array){
        if (array.length==0){
           return "null";
        }
        int temp ;
        for (int i=0;i<array.length-1;i++){
            for (int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                   temp  =array[j];
                   array[j]=array[i];
                   array[i]=temp;
                }
            }
        }
        return(Arrays.toString(array));
    }
}

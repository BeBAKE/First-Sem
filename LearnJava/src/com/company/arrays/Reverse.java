package com.company.arrays;

import java.util.Arrays;

import static com.company.arrays.Swap.swap;

public class Reverse {
    public static void main(String[] args) {
        int[] he = {1,3,4,6,9,78,2,4,909,-6};
        reverse(he);
    }
    static void reverse (int[] arr){
        for (int i = arr.length-1;i>0;i-- ){
            for (int j=0 ; j< i ;j++){
                swap(arr,j+0,j+1);
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}

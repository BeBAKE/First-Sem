package com.company.arrays;

import java.util.Arrays;

public class Max {

    public static void main(String[] args) {
        int[] he ={3,1,43,577,60,7,9};

        System.out.println(maxElement(he));
    }

    private static int maxElement(int[] arr) {
        if(arr.length == 0){
            return -1;
        }
        int max = arr[0];
        for(int i=0; i<arr.length ; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

}

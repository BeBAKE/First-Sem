package com.company.arrays;

import java.util.Arrays;

public class Swap {

    public static void main(String[] args) {
        int[] he = {1,3,4,6,9,78,2,4,909,-6};
        swap(he,3,2);
        System.out.println(Arrays.toString(he));
    }

    static void swap(int[] arr,int index1, int index2){
        int temp,a,b;
        temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2] = temp;

    }
}

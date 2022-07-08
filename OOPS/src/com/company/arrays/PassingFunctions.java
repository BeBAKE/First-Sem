package com.company.arrays;

import java.util.Arrays;

public class PassingFunctions {
    public static void main(String[] args) {
        int[] nums = {34,2,3,4,5};
//        int[] gums = {};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
//        System.out.println(nums);
//        System.out.println(gums);
    }
        // Here in it is passing the copy of the reference variable in the argument of change method.
    private static void change(int[] arr) {
        arr[0]=1;
    }
}

package com.company.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ForEachLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i=0 ;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
                          //  Outputting elements of the array  //

//        for(int i =0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }

                             // OR (IN PLACE OF ABOVE simple for LOOP USING ENHANCED for LOOP)

//        for(int num : arr){    // for every element in the array print the array.
//            System.out.println(num+" ");  // here num represents element of the array.
//        }

                                     // OR (BEST Way 💚 )

        System.out.println(Arrays.toString(arr)); // This toString is an in-build method
                                                  // of Class Array
                                         // Basically Arrays.toString() takes array as an input and
                                     // print it in [ , , .... , ] format.
    }
}

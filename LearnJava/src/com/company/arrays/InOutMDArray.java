package com.company.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InOutMDArray {
    public static void main(String[] args) {

        /*
                  Inputting and outputting elements in a 2D Array using for loop
         */

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int[][] arr2= {
                {11,12,13,14},
                {15,16},
                {17,18,19}
        };

        /*

                        🔥  INPUT   🔥

         */

        for (int row = 0 ; row <arr.length ;row++ ){  //
            for (int col = 0 ; col < arr[row].length ;col++){
                arr[row][col]= sc.nextInt();     // we can directly use sc.nextLine() to input without using a variable
            }
        }


        /*

                        🔥  OUTPUT 🔥

         */

        System.out.println("First Way of Output");

        for (int row = 0 ; row <arr.length ;row++ ){
            for (int col = 0 ; col < arr[row].length ;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();    // goes to next line after each row completion
        }

                           //     OR       //

        System.out.println("Second Way of Output");

        for (int row = 0 ; row <arr.length ;row++ ){
            System.out.println(Arrays.toString(arr[row]));
        }

                            //     OR   ( Using enhanced for loop)    //

        System.out.println("Third Way of Output");

        for(int[] a :arr ){    // In 1-d array we use int variable_name , which is a number,which go through each element of array
                                     // and then we use sout(a) to print elements
            // Likewise here we use int[] var_name , where var_name is an array ,which go through
                 // each array in the main array
                 // and then we use Arrays.toString(a) which takes
                 // an array as an input to print it in [ , , ..... , ] format.
            System.out.println(Arrays.toString(a));
        }

        for (int row=0 ; row<arr2.length ; row++){
            for (int col = 0; col<arr2[row].length ;col++){
                System.out.print(arr2[row][col]+" ");
            }
            System.out.println();
        }
    }
}

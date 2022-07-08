package com.company.arrays;

public class Array {
    /*
                   SYNTAX
               data_type[] variable_name = new datatype[size];

     */

    public static void main(String[] args) {

                              // array of primitives //

                   // Inputting Values in array //

                  // BREAKDOWN OF THIS ARRAY
       int[] roll ;       // declaration of array. roll is getting defined in the stack.
       roll = new int[5];     //initialization : actually here object is being created in the memory(heap memory).

                   // OR

       int[] head = new int[5];
       head[0]=3;
       head[1]=23;
       head[2]=77;
       head[3]=86;
       head[4]=2;
       // [3,23,77,86,2]

                    // OR

       int[] age = {12,22,32,21,22};
    }
}

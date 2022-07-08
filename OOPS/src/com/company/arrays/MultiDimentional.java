package com.company.arrays;

public class MultiDimentional {
    /*
            2-D Array is like -
           1 2 3
           4 5 6
           7 8 9

        Syntax-

        int[][] arr2d = new int[n][m];
                    OR
        int[][] arr2d = {
               {1,2,3} ,
               {4,5,6} ,           or   { {1,2,3} , {4,5,6} , {7,8,9} }
               {7,8,9}
        }


        1st [] is for rows ( or horizontal lines) ( or no of internal {} )
        2nd [] is for columns ( or vertical lines) ( or no of elements in each internal {} )

        we can leave 2nd [] empty, but 1st one should be specified

     */
    public static void main(String[] args) {

        int[][] arr2D = {
                {2, 4, 6},   // 0th index
                {8, 10, },    // 1st index
                {12,14, 16, 18} //2nd index
        };
        System.out.println(arr2D.length); // Prints number of rows



    }
}




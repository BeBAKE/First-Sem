package com.company.arrays;

import java.util.Scanner;

import java.util.ArrayList;

public class MDArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Initializing
        for(int i =0; i<3 ;i++){
            list.add(new ArrayList<>());
        }

        // Adding elements
        for(int i=0; i<3; i++){
            for (int j= 0; j<3 ; j++){
              list.get(i).add(sc.nextInt());
            }
        }

        //Printing Multi-Dimensional ArrayList
        System.out.println(list);   // It's simple because class ArrayList has in-build feature to print
                                        // arraylist.

    }

}


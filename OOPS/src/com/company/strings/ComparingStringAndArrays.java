package com.company.strings;

import java.util.Scanner;

public class ComparingStringAndArrays {
    public static void main(String[] args) {

                 // Comparing Strings
// 1.
        //Because Strings are immutable ,also
        String name1 = "neofetch";
        String name2 = "neofetch";
        // In java String Pool reference variable name1 and name2 are pointing to the just one(same) object
        // neofetch

        System.out.println(name1==name2); // == operator compares the memory address of name1 and name2
        System.out.println(name1.equals(name2));// .equals() methods compares the content

//         to make name2 point to the different object with the same name
//         we can use " new " keyword (it will make a new object " neofetch "
//         out of the string pool , in the java heap.

        name2=new String();
        System.out.println(name1==name2);       //False (because now one is outside String Pool
        System.out.println(name1.equals(name2));//True (because both have the same content i.e neofetch

//2.
        Scanner sc = new Scanner(System.in);    // when we input the string both go in java heap
        String name3= sc.next();
        String name4= sc.next();

        System.out.println(name3==name4);           //False
        System.out.println(name3.equals(name4));    //True


        //Comparing Arrays

        //Arrays are mutable(changeable) in java, so
        //they both are pointing to the different object
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};

        System.out.println(arr1==arr2);
        System.out.println(arr1.equals(arr2));




    }
}

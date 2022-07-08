package com.company.assignment;

import java.util.Scanner;

public class LargestNumber {

    // Program will take input as integers till user enters 0
    // When user enters 0 , program will end and it will print the greatest integer entered by user


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 //       int max = 0;
        int max = Integer.MIN_VALUE;
        int i = 1;
        int n;
        while (true) {
            System.out.print("Enter the number : ");
            n = sc.nextInt();
//            i--;
//            if (n != 0) {
//                if (n < 0) {
//                    if (i == 0) {
//                        max = n;
//                    }
//
//                }
//                if (n > max) {
//                    max = n;
//                }

            // above code is used if max is set to 0 (kyunki mujhe pata nahi tha ki min_value bhi hota hai kuch).
                 // to 0 ke hizab se jugad lagaya tha upper wale code mein.
                 // we can set max to minimum integer so that every number entered is already greater that minimum integer


            if (n == 0) {
                System.out.println("Greatest number is " + max);
                break;
            }
            if(n>max){
                max=n;
            }
        }
    }
}

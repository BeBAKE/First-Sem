package com.company.assignment;

import java.util.Scanner;

public class SumOfAllNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum= 0;
        while(true){
            System.out.print("Enter the number : ");
            int n= input.nextInt();
            if (n==0){
                System.out.println("Entered 0\nProgram is exiting....");
                break;
            }
            sum+=n;
        }

        System.out.println("Sum of all the entered number is : "+sum);
    }
}

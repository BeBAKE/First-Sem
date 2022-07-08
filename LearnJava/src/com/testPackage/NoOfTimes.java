package com.testPackage;

import java.util.Scanner;

public class NoOfTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        long num = sc.nextLong();
        System.out.print("Enter the number to check : ");
        int num2 = sc.nextInt();
        int count=0;
        int rem=0;
        while (num>0){
            rem=(int)num%10;
            if (rem==num2){
                count++;
            }
            num=num/10;

        }
        System.out.println("Number of times "+num2+" is in the number is : "+count);
    }

}

package com.testPackage;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of times fibonacci Series should be printed \n" +
                "Hum to yahan nokar bethen hai na! : ");
        int n=sc.nextInt();
        int sum ; int last=0; int lead=1; int c=1;
        System.out.print(0+" ");
        for (sum=1;c<n;c++){
            System.out.print(sum+" ");
            sum=last+lead;
            last=lead;
            lead=sum;


        }
    }
}

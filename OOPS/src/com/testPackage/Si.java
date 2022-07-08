package com.testPackage;

import java.util.Scanner;

public class Si {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the interest rate : ");
        int rate = sc.nextInt();

        System.out.print("Enter the Principal amount : ");
        int P= sc.nextInt();

        System.out.print("Enter the Time Period : ");
        int T = sc.nextInt();

        int Si = (P*rate*T)/100;
        System.out.println("Simple Interest is "+Si);


    }
}

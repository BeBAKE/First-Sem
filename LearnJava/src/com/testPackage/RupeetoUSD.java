package com.testPackage;

import java.util.Scanner;

public class RupeetoUSD {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter rupees : ");
        float ru = sc.nextFloat();

        System.out.println("₹"+ru+" = "+"$"+ru*0.0134);
    }
}

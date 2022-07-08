package com.testPackage;

import java.util.Scanner;

public class NaturalMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter natural number : ");
        int num = sc.nextInt();
        System.out.println("Sum of first "+num+" natural numbers is "+natSum(num));

    }
    static int natSum(int n){
        int sum=0;
        for (int i =1;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }
}

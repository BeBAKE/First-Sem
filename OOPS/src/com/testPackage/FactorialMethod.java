package com.testPackage;

import java.util.Scanner;

public class FactorialMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        long num = sc.nextLong();
        long fac = fact(num);
        if (num>=0){
            System.out.println(num+"! = "+fac);
        }else {
            System.out.println("Number should be greater than 0 ");
        }
    }

    static long fact(long n){
        if(n==0){
            return 1;
        }
        for (long i=n-1 ; i>1;i--){
            n*=i;
        }
        return n;
    }
}

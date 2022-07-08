package com.testPackage;

import java.util.Scanner;

public class PrimeBTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting of the range: ");
        int num1 = sc.nextInt();
        System.out.print("Enter ending of the range: ");
        int num2 = sc.nextInt();
        prime(num1,num2);

    }

    static void prime(int a , int b){
        int flag = 0;
        int count=0;
        if(a==1){
            System.out.println(a+" is nor prime nor composite");
            a=2;
        }
        // Loop to supply number in between a and b.
        for (int i =a; i<=b;i++){
            //Loop to check if number is prime
            for (int x = 2;x<=i/2;x++){
                if (i%x==0){
                    flag++;
                    break;
                }
            }if(flag==0) {
                count++;
                System.out.println(i + " is a prime number ");
            }flag=0;

        }
        System.out.format("Total prime numbers in %d and %d are %d",a,b,count);
    }


}


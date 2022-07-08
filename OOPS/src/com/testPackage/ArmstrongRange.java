package com.testPackage;

import java.util.Scanner;

public class ArmstrongRange {

    static int howMany(int x){
        int c=0;
        while (x > 0) {
            x = x / 10;
            c++;
        }
        return c;
    }

    public static void main(String[] args) {

        int num1,num2;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number : ");
        num1 =sc.nextInt();
        System.out.print("Enter second number : ");
        num2 =sc.nextInt();

        for (int i =num1; i<num2;i++){
            int test=i; int sum=0;
            while(test>0){
                sum=sum+(int)Math.pow((test%10),howMany(i));
                test=test/10;
            }
            if(sum==i){
                System.out.println(i+" is an angstrom number");
            }
        }

    }
}

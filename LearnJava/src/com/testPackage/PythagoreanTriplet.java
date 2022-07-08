package com.testPackage;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        isPythagorean(num1,num2,num3);
        System.out.println(num1+""+num2+""+num3);

    }

    static void isPythagorean(int a , int b , int c ){
        int x,y,z;
        x= (int)Math.pow(a,2);y= (int)Math.pow(b,2);z= (int)Math.pow(c,2);
        if (x==y+z || y==x+z || z==x+y){
            System.out.println(a+","+b+","+c+" are pythagorean triplet");
        }else {
            System.out.println(a+","+b+","+c+" are not pythagorean triplet");
        }
    }
}

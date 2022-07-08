package com.testPackage;

import java.util.Scanner;
public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

//        if (a>b && a>c){
//            System.out.println(a+" is greatest");
//        }else if (b>c){
//            System.out.println(b+" is greatest");
//        }else{
//            System.out.println(c+" is the greatest");
//        }

                // OR

        int max=a;
        if (b>max){
            max= b;
        }if(c>max){
            max=c;
        }
        System.out.println("greatest value is "+max);


    }
}

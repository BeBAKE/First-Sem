package com.company.Wow;

public class PrinStrinAndNum {
    public static void main(String[] args) {

        int num1 = 12;
        int num2= 10;

        System.out.println(num1+num2+" and "+num1+num2);  // Here anything after string is treated as string as default
        System.out.println("num1 + num2 "+num1+num2);


        // To make this not happen we can use brackets like below
        System.out.println(num1+num2+" and modified version "+(num1+num2));


        System.out.println("this is one thing ");        //println print one line and then moves the cursor to the next line
        System.out.print("this is second thing");
        System.out.println("this is third thing");

    }

}

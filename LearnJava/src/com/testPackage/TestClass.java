package com.testPackage;
import java.util.Scanner;
public class TestClass {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       long num = sc.nextLong();
       int test=0;
       int count=0;
       while (num>0){
           num=num%10;
           if (num==7){
               count++;
           }
       }
        System.out.println("Number of times 7 was in the number was : "+count);
    }
}

package com.testPackage;

public class ReverseNumber {
    public static void main(String[] args) {
        int n= 263836;
        int num2 = 0;
        while (n>0){
            int rem=n%10;
            num2 = (num2 * 10) + rem;
            n/=10;
        }
        System.out.println("reversed number is "+num2);
    }
}

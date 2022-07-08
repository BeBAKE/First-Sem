package com.testPackage;

import java.util.Scanner;

public class PalindromeMethod {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        if(pal(num)){
            System.out.println(num+" is palindrome \uD83D\uDE00");
        }else{
            System.out.println(num+" is not a palindrome \uD83D\uDE2D");
        }

//        System.out.println("Palindrome of "+num+" is "+pal(num));


    }
    static boolean pal(int num){
        int check=num;
        int rev =0;
        while(check!=0){
            rev=(rev*10)+(check%10);
            check/=10;
        }
        return rev==num;
    }
}

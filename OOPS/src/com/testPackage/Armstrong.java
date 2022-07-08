package com.testPackage;
import java.lang.Math;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();

        int x=num1; int y=num2;
        int sum1=0;int sum2=0;

        while (x>0){
            sum1=sum1+((x%10)*(x%10)*(x%10));
            x=x/10;
        }
        while (y>0){
            sum2=sum2+((y%10)*(y%10)*(y%10));
            y=y/10;
        }


        if (sum1==num1 || sum2==num2){
            if(sum1==num1 && sum2==num2){
                System.out.println(num1+" and "+num2+", both are angstrom numbers");
            }else if (sum1==num1){
                System.out.println("Only "+num1+" is angstrom number");
            }else{
                System.out.println("Only "+num2+" is angstrom number");
            }
        }else {
            System.out.println("None of the given numbers are angstrom number" +
                    "\nWhat do you thing i do here" +
                    "\nBITCH ENTER ATLEAST ONE ANGSTROM NUMBER");
        }


    }
}

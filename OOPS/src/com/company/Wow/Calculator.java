package com.company.Wow;

import java.util.Scanner;

public class Calculator {
    public  static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Taking two numbers form user to operate upon.


        int ans=0;

        while (true){

            //Taking first number .
            System.out.println();
            System.out.print("Enter first number : ");
            int num1= sc.nextInt();

            // Taking the operand to use on operator.
            System.out.print("Enter the operation ");
            char op = sc.next().trim().charAt(0);

            //Taking the second number.
            System.out.print("Enter 2nd number : ");
            int num2= sc.nextInt();
            System.out.println();

            if(op== '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                if (op=='+'){
                   ans =  num1+num2;
                }if (op=='-'){
                    ans =  num1-num2;
                }if (op=='*'){
                    ans =  num1*num2;
                }if (op=='/'){
                    if (num2!=0){
                        ans =  num1/num2;
                    }else{
                        System.out.println("Denominator can't be zero . YOU DUMB PIECE OF SHIT! ");
                        continue;
                    }
                }if (op=='%'){
                    if (num2!=0){
                        ans =  num1%num2;
                    }else{
                        System.out.println("Denominator can't be zero . YOU DUMB PIECE OF SHIT! ");
                        continue;
                    }
                }

            }else if(op =='x' || op == 'X' ){
                System.out.println("Pressed x or X \n...............\n EXIT");
                break;
            }else{
                System.out.println("INVALID Operation\nBITCH!");
                continue;
            }
            System.out.println(ans);

        }



    }


}

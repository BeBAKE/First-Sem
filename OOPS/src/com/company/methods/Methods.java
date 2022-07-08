package com.company.methods;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

        /*
              return_type name(arguments) {
                  // body
                  return statement;
              }

         */

        // return_type is , when we call the function what is the value of that call going to be.
        // Ex- Below when we wrote sum() it, is the calling of function sum
             // 1. now the type of data it [sum() ] will have after it execute the whole code of sum ,is the return_type
             // 2. The value of that called function is going to be what is after return KEYWORD.
                   // it can be void , int , double , long etc.
                   // if it is void it is not going to return any value to the function call


        sum();     // It is called ,function call.  It does not hold any value , it just executes the code that was in it at the time of its
                      // calling (which is now) , because it has void return type.



        diff() ;   // It holds the value of diff variable. It will not print it,it will just execute it.


        System.out.println(diff()); // Here it is calling the diff() [diff function] and also printing the value that
                                         // it holds which is written after KEYWORD return.
        // OR we can also do this
        int alpha = diff();
        System.out.println(alpha);



        int ans = multi(25,5);
        System.out.println(ans);


    }

    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2= sc.nextInt();
        int sum = num1+num2;
        System.out.println("Sum of "+num1+" and "+num2+" is "+sum);

    }

    static int diff(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1= sc.nextInt();
        System.out.print("Enter second number : ");
        int num2= sc.nextInt();

        int diff = num1-num2;
        return diff;

        // or we can also do
           // return num1-num2;
    }

    static int multi(int a ,int b){   // Here a , b , mul are local variables ,i.e they are not defined outside.
        int mul = a*b;                   // sout(a) outside this function will give error .
                                     // that's why we can use num1 and num2 in TWO METHODS without error.
        return mul;
    }



}

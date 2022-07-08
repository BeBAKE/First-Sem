package com.company.conditional;
import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {

        //  USE FOR INSTEAD OF WHILE IN
                // CASE YOU KNOW HOW MANY TIMES THE LOOP IS GONNA RUN

        /*
            Syntax of for loop

            for (initialization ; condition ; increment/decrement) {

                  // body

            }
         */

        System.out.println("Simple ");
       for (int i =0;i<=5;i++){
           System.out.println(i);
       }

        //     Using scanner class
        System.out.println("Using Scanner class");
       Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
       int num= input.nextInt();
       for (int i=0;i<=num;i++){
           System.out.println(i);
       }



    }
}

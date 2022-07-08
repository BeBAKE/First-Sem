package com.company.conditional;

public class DoWhile {
    public static void main(String[] args) {

        //   THIS WILL RUN ATLEAST ONCE BEFORE CHECKING THE CONDITION

        /*   Syntax of do while loop

                        initialization;
                        do {
                              //body
                        }while(condition);

         */

        int n = 1;
        do {
            System.out.println("first runs then" +
                    "\nchecks for condition and run");
        }
        while(n!=1);
    }
}

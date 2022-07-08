package com.company.strings;

public class FormattedPrint {

    public static void main(String[] args) {

        // % is called place holder
        // .2 or .3 is the no of place holders to print
        // f is used for float

        float a = 23.34586f;
        System.out.printf("Formatted Number is, %.2f",a);
        System.out.println();
        System.out.printf("Formatted Pi is %.3f",Math.PI);
        System.out.println();


        // s is used for String.
        System.out.printf("Hi! my name is %s and i am %s ","Vivek","suffering");
        System.out.println();

        // Add a number separater.
        // using ,.xf  --> x is the number of places we want after the
        System.out.printf("the price of %s is $%,.2f","macbook",1999999.66797f);

    }
}

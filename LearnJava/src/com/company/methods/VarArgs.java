package com.company.methods;

import java.util.Arrays;

public class VarArgs {

    public static void main(String[] args) {
        fun(3,32,4,22,443,232,242,3,2);
        sun("we","can","add","any","no","of","arguments","here");
        multiple(3,4.56,"varible","length","argument","should","be","in the end");
    }


            /*       Variable arguments in the method

            static return_type method_name (data_type ...v) {

                      System.out.println(Arrays.toString(v)); // This is just to show that variable arguments works

            }

             */

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
        System.out.println();
    }

    static void sun(String ...v){
        System.out.println(Arrays.toString(v));
        System.out.println();
    }

              // In multiple's case the variable length argument should be in the end
    // because we don't know when it will end
    // also that could be of any datatype.

    static void multiple(int a , double b,String ...v){
        System.out.println(a+" "+b+" "+Arrays.toString(v));
    }

}


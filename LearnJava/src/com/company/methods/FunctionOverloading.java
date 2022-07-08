package com.company.methods;

public class FunctionOverloading {

    /*
               two methods with same name can't exist
               until they have different parameter datatype or s
               with same datatype but different number of arguments.
     */

    static void wun(int a ){
        System.out.println("this is wun method with int a as parameter");
    }
    static void wun(String name){
        System.out.println("this is wun method with String name as parameter");
    }
    static void wun(int a, int b){
        System.out.println("this is with same int datatype but the number of arguments are different");
    }

    public static void main(String[] args) {
        wun(8);
        wun("Vivek");
        wun(8,88);
    }


}

package com.company.methods;

public class Showdowing {

    static int x= 90;  // this is called class variable and is valid in whole class Shoadowing.
                      // this will be shadowed at line 13.

    public static void main(String[] args) {
        System.out.println(x);  // 90
        int x ;     //the class variable at line 5 is shadowed by this.
  //      System.out.println(x); // Scope will begin when the value is initialized
        x=40;
        System.out.println(x); //40
        fun();      //90
    }

    private static void fun() {
        System.out.println(x);
    }

}

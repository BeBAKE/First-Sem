package com.company.methods;

public class FunctionScope {
    public static void main(String[] args) {

            //  Variable,Parameters defined in one function is not defined in another.

       int a = 10;
       int b=20;
    // System.out.println(marks);   #error  [Parameter defined in random function]
    // System.out.println(num);     #error  [Variable defined in random function]

        // We can also use same variable names for more than one function.
            // And their values are independent of each other.
       int hazard = 1_999;
       System.out.println(random(7));
       System.out.println(hazard);


    }

    static int random(int marks){
        int num = 67;
        int hazard= 38;
        System.out.println(num);
        System.out.println(marks);
      //System.out.println(a);      #error   [Variable defined in main function]
      //System.out.println(b);      #error   [Variable defined in main function]
        return hazard;
    }

}

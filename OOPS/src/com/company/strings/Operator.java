package com.company.strings;

import java.util.ArrayList;

public class Operator {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println('a'+3);

        System.out.println((char)('a'+3));

        System.out.println("a"+1); //It is after few steps is same as "a"+"1"
                                //🔥 WHEN INTEGER IS CONCATENATED it is converted into its wrapper class.
                                // Here 1 is converted into Integer(wrapper Class)
                                // that will call toString()
        // ( basically here toSting is the method of println where it converts every object to string after " "+ )

        System.out.println("Working"+new ArrayList<>());
//        System.out.println("Working"+new Integer(55));
//        System.out.println(new Integer(56)+ new ArrayList<>()); It will produce Error because
        // In java + operator can only be used on primitives or if at-least one of the qty is a String.

        System.out.println(new Integer(88)+""+new ArrayList<>());// Here we have at-least one Stirng.

    }
}

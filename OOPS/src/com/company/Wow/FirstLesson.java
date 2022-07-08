package com.company.Wow;
//package =Folder in which out java file will lie

import java.util.Scanner;

public class FirstLesson {
    // public = means this class can be accessed from anywhere
    // class is name group of properties and function
    // First is just the name of the file(it has to be same as the name of this whole class).
    // ** it only has to be the name of whole file ,iff it is public.
    public static void main(String[] args) { // THIS IS THE ENTRY POINT OF PROGRAM,NOTHING IS GOING TO RUN BEFORE THIS .

        /*     String[] args: It stores Java command line arguments and is an array of type java. lang. String class.
               Here, the name of the String array is args ,but
               it is not fixed and user can use any name in place of it. */

        /*   static(access modifier) = we want to run this main function without making object of this class Main
             Basically static is used to make the value same throughout. */

        // void (or any datatype ) used just before is the type of data we want to get from this class

        int x = 55;
        int y= 33;
        System.out.println("The addition of ");
        System.out.println(x+" and "+y+" is "+(x+y));

        //The System class contains several useful class fields and methods. It cannot be instantiated.
        // Among the facilities provided by the System class are standard input, standard output, and error output streams

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        sc.nextLine();
        System.out.println(age);

        String name= sc.nextLine();
        System.out.println(name);
        //sc.close();

        System.out.println(sc.nextLine());


    }
}

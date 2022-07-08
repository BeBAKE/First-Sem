package com.company.Wow;
import java.util.Scanner;
public class Inputs {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        System.out.print("Enter your roll no : ");
//        int roll_no = input.nextInt();
//        System.out.println("Entered roll no is : "+roll_no);

        int a = 10;

        // Here a ,the reference variable is identifier
        // So , identifier is name of variable , method , Class , Packages etc.

        //      10 = literal




        int age = input.nextInt();
        input.nextLine();      //sc.nextLine() to use if we have to use STRING after and before any number datatype.
                              // i.e we can't make the SANDWICH with STRING input.
        String name= input.nextLine();
        int power= input.nextInt();
        System.out.println("Name of the person is : "+name+
                "\nAge of that same person is : "+ age+
                "\nPower of "+name+" is "+power+"%");

    }
}

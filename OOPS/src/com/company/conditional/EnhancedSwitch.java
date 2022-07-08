package com.company.conditional;

import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        // We don't need to use break here because after every case
          //  break is automatically applied.

//        switch (day){
//            case 1-> System.out.println("Monday");
//            case 2-> System.out.println("Tuesday");
//            case 3-> System.out.println("Wednesday");
//            case 4-> System.out.println("Thursday");
//            case 5-> System.out.println("Friday");
//            case 6-> System.out.println("Saturday");
//            case 7-> System.out.println("Sunday");
//            default-> System.out.println("Enter something valid BITCH!");


                    // Here after case 5 and case 7 break is applied automatically.
        //Using break depends upon the situation. Below is the situation ,
           // WHEN WE DON'T NEED BREAK STATEMENT UNDER EVERY STATEMENT

           // Ques. - Which day is a weekday and which a weekend

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Invalid");
        }
    }
}

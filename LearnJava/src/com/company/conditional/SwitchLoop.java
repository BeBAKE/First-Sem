package com.company.conditional;

import java.util.Scanner;

public class SwitchLoop {

    /*
         Syntax of switch case

         switch(condition){

            case "condition1" :
                  //body;
                  //break
            case "condition2" :
                  //body;
                  //break
            default:
                 //body


          Cases can't be same
          IF default is used in the middle , it need break .

     */


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

//        switch (fruit) {
//            case "Orange":
//                System.out.println("Round fruit");
//                break;
//            case "Apple" :
//                System.out.println("A sweet red fruit");
//                break;
//            case "Mango":
//                System.out.println("King of fruits");
//                break;
//            case "Banana":
//                System.out.println("good");
//                break;
//            default:
//                System.out.println("Invalid");
//            }

                   // OR (Better Way to write this )
                       //Here break is internally applied to every case .

        switch (fruit){
            case "Orange" -> System.out.println("round fruit");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Mango"-> System.out.println("King of fruits");
            case "Banana"-> System.out.println("good");
            default -> System.out.println("Invalid");
        }



        }
    }


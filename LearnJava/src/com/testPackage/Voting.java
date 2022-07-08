package com.testPackage;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.print("Enter the age of BITCH : ");
            int age = sc.nextInt();

            if (voting(age)){
                System.out.println("BITCH Can vote ✅ ");
            }else {
                System.out.println("BITCH Can't vote ❌ ");
            }

            System.out.println();
            System.out.print("Any BITCH left (y/n) : ");
            char ch = sc.next().trim().charAt(0);
            if (ch=='n'||ch=='n'){
                break;
//            }else if (ch=='y'||ch=='Y'){
//                //continue;
//            }
//            while(ch!='n' ||ch!='N' ||ch!='y' ||ch!='Y' ){
//                System.out.println("\nLISTEN YOU PIECE OF SHIT\n Enter something valid " +
//                        "\n Its either y or n" +
//                        "\n Lets try again ");
//                System.out.println();
//                System.out.print("Any BITCH left (y/n) : ");
//                ch = sc.next().trim().charAt(0);
//                if (ch=='n'||ch=='n'){
//                    break;
//                }else if (ch=='y'||ch=='Y'){
//                    //continue;
//                }
//
            }
            System.out.println();

        }

    }
    static boolean voting(int num){
        return num>=18;
    }
}
//else{
//        System.out.println("\n LISTEN YOU PIECE OF SHIT\n Enter something valid " +
//        "\n Its either y or n" +
//        "\n Lets try again ");
//        }
package Miscellaneous;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
//        String[] str = {"@","#","$","%","&"};
//        for(int i = 0; i <5;i++){
//            for(int e= 0;e<=i;e++){
//                System.out.print(str[i]);
//            }
//            System.out.println();
//        }


//        for(int i = 1; i <6;i++){
//            for(int e= 1;e<=i;e++){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }


//        for(int row = 1; row<n;row++){
//            for(int col =1;col<=row;col++){
//                System.out.print(" ");
//            }for(int i = 1;i<row;i++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for(int row = n; row>0;row--){
//            for(int col =row;col>0;col--) {
//                System.out.print(" ");
//            }for(int i = 1;i<row;i++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        for(int row = n; row>0;row--){
            for(int col =n;col>0;col--){
                System.out.print(" ");
            }for(int col =1;col<n;col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

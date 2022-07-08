package com.testPackage;

import java.util.Scanner;

public class SmallGreatMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        greatest(num1,num2,num3);

        int smallest = smallest(num1,num2,num3);
        System.out.println(smallest+" is smallest among three");

    }
    static void greatest(int a , int b, int c){
        if (a>b && a>c){
            System.out.println(a+" is greatest among three");
        }else if (b>c){
            System.out.println(b+" is greatest among three");
        }else {
            System.out.println(c+" is greatest among three");
        }
    }
    static int smallest(int a , int b, int c){
        int small = a;
        if (b<a){
            small = b;
        }
        if (c<a){
            small = c;
        }
        return small;
    }

}

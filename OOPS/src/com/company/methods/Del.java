package com.company.methods;

public class Del {
    public static void main(String[] args) {
//        String name = "Vivek";
//        change("his");
//        System.out.println(name);
        int a = 10;
        int b= 20;
        swap(a,b);
        System.out.println(a+" "+b);
    }

//    static void change(String tom) {
//        tom = "Sunny";
//        System.out.println(tom);
//    }
    static void swap(int x,int y){
        int temp;
        temp = x;
        x=y;
        y=temp;
        System.out.println(x+" i "+y);
    }


}

package com;

import java.util.Scanner;
import java.util.Random;
public class God {
    public static void main(String[] args) {
        Random venesa = new Random();

        while (true){
            int first = venesa.nextInt(999999);
            int second = venesa.nextInt(888888);
            System.out.println("first "+first);
            System.out.println("second "+second);
            if (first == second){
                System.out.println("What the fuck is this!");

            }
        }
    }
}

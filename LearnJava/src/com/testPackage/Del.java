package com.testPackage;
import java.util.Scanner;
public class Del {
    public static void main(String[] args) {
        int c = 0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x = num;
        while (x > 0) {
            x = x / 10;
            c++;
        }
        System.out.println(c);

        int test = num;
        int sum = 0;
        while (test > 0) {
            sum = sum + (int) (Math.pow(test % 10, c));
            test = test / 10;
        }
        System.out.println(sum);
        if (num==sum){
            System.out.println("yo");
        }
    }
}

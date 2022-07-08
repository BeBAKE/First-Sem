package com.company.assignment;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("Enter the radius of sphere : ");
            double rad = sc.nextDouble();

            double volume =  ((4)*(3.14)*Math.pow(rad,3))/3;
            System.out.println("Voluem of Sphere is : "+volume);

            System.out.print("Do you want to continue or not \nPress Y/N : ");
            char ch = sc.next().trim().charAt(0);
            if (ch == 'N' || ch == 'n'){
                System.out.println("Program is exiting ..........");
                System.out.println("EXITED");
                break;
            }else{
                continue;
            }
        }



    }
}

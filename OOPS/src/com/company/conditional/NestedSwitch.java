package com.company.conditional;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empID = sc.nextInt();
        String Department = sc.next();

        switch (empID) {
            case 1 -> System.out.println("Vivek Singh");
            case 2 -> System.out.println("Ramadhir");
            case 3 -> {
                System.out.println("Emp no 3");
                switch (Department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department");
                }
            }
            default -> System.out.println("Invalid");
        }


         // Another Way to write above code.


//        switch(empID){
//            case 1:
//                System.out.println("Vivek Singh");
//                break;
//            case 2:
//                System.out.println("Ramadhir");
//                break;
//            case 3:
//                System.out.println("Emp no 3");
//                switch(Department){
//                    case "IT":
//                        System.out.println("IT Department");
//                        break;
//                    case "Management":
//                        System.out.println("Management Department");
//                        break;
//                    default :
//                        System.out.println("No department");
//                }
//                break;
//            default :
//                System.out.println("Invalid");
//        }
//

    }
}

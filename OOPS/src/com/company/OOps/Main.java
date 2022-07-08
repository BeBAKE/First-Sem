package com.company.OOps;

public class Main {

    public static void main(String[] args) {


           //        Car.java


//        Car porshe =new Car();
//        Car maruti = new Car();
//
////        porshe.model = "Canarie"             this is same as porshe.getModel()
//        System.out.println(porshe.getModel());
//        porshe.setModel("canarie");
//        System.out.println(porshe.getModel());


            //      BankAccount.java without constructors

//        BankAccount vivekAccount = new BankAccount();
//        BankAccount amanAccount = new BankAccount();
//        BankAccount aryanAccount = new BankAccount();
//
//        vivekAccount.setCustomerName("Vivek");
//        vivekAccount.setAccountNumber("67587");
//        vivekAccount.setEmail("viveksinghcharak004@gmail.com");
//        vivekAccount.setPhNo("123456789");
//        vivekAccount.setBalance(199);
//
//
//        vivekAccount.deposit(199);
//        vivekAccount.withdrawal(199);
//        System.out.println(vivekAccount.getBalance());



        // BankAccount.java with constructors

        BankAccount vivek= new BankAccount("123456789",100,"Vivek Singh",
                "viveksinghcharak004@gmail.com","12345");

        System.out.println(vivek.getBalance());
        System.out.println(vivek.getAccNo());
        System.out.println(vivek.getCustomerName());
        System.out.println(vivek.getEmail());
        System.out.println(vivek.getPhoneNumber());

        // Calling Constructors from within a constructor
        // or creating default values for the constructor

//        BankAccount aman = new BankAccount();





    }
}

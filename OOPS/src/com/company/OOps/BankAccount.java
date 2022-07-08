package com.company.OOps;

public class BankAccount {
    private String accountNumber ;
    private double balance ;
    private String customerName;
    private String email;
    private String phoneNumber;


    // Using a special case of "this" we can call a constructor from within a constructor
    public BankAccount(){
        this("00000",0.0,"Default Name","Default Email","none");
        System.out.println("constructor with no parameter");
    }

    //     Again Calling the constructor within the constructor
    // Here we are just passing the last three values and rest we want computer to pass itself
    //Basically
    public BankAccount(String customerName,String email,String phoneNumber){
        this("1800310900",100,customerName,email,phoneNumber);
        this.email= email;
        this.customerName=customerName;
        this.phoneNumber=phoneNumber;

    }

    //      CONSTRUCTOR

    public BankAccount (String accountNumber,double balance ,
                        String customerName,String email,
                        String phoneNumber){
        System.out.println("Account constructor with parameters called");
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.customerName=customerName;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }


    // .........................IN case of using setters we can use constructors to set the values on
    //                      the time of calling initializing the object ( i.e Class object = new Class())



//    // Setter for account number
//    public void setAccountNumber(String accNo){
//        this.accountNumber=accNo;
//    }
//    // Setter for balance
//    public void setBalance(double bal){
//        this.balance=bal;
//    }
//    // Setter for customer name
//    public void setCustomerName(String cname){
//        this.customerName=cname;
//    }
//    // Setter for email
//    public void setEmail(String email){
//        this.email=email;
//    }
//    // Setter for phone number
//    public void setPhNo(String pno){
//        this.phoneNumber=pno;
//    }

    // ......................................

    //getter for account number
    public String getAccNo(){
        return this.accountNumber;
    }
    //getter for balance
    public double getBalance(){
        return this.balance;
    }
    //getter for customer name
    public String getCustomerName(){
        return this.customerName;
    }
    //getter for email
    public String getEmail(){
        return this.email;
    }
    //getter for phone number
    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    // Method to deposit fund
    public void deposit(double money){
        this.balance+=money;
        System.out.println("Amount deposited : ₹"+money);
    }

    // Method to withdrawal money
    public void withdrawal(double money){
        if(money>this.balance){
            System.out.println();
            System.out.println("Withdrawl not allowed\nInsufficient Balance" +
                    " \nBegger!\nPeasant\uD83E\uDD2C");
            System.out.println();
        }else{
            this.balance-=money;
            System.out.println();
            System.out.println("Ammount withdrawl is ₹"+money);
            System.out.println();
        }
    }

}

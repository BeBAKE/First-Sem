package com.company.OOps;

public class VipCustomers {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomers(){
        this("Vivek",1000,"viveksinghcharak004@gmail.com");
    }

    public VipCustomers(String name, double creditLimit){
        this(name,creditLimit,"default@emial.com");
//        this.name = name;
//        this.creditLimit=creditLimit;
    }

    public VipCustomers(String name, double creditLimit,String emailAddress){
        this.name= name;
        this.creditLimit= creditLimit;
        this.emailAddress=emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}

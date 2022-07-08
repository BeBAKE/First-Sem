package com.company.OOps;

public class Dog extends Animal{
    private int eyes;
    private int legs ;
    private int  tail;
    private int teeth;
    private int coat;

    public Dog(String name , int brain , int body , int size , int weight){
        super(name,1,1,size,weight);
        this.eyes= eyes;
        this.legs= legs;
        this.tail= tail;
        this.teeth= teeth;
        this.coat= coat;
    }

    public void bark(){

    }
}

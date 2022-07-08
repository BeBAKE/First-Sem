package com.company.OOps;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }


    public void setFirstName(String first){
        this.firstName=first;
    }
    public void setLastName(String last){
        this.lastName=last;
    }
    public void setAge(int age){
        if(age<0||age>120){
            this.age=0;
        }
        else{this.age=age;
        }
    }

    public boolean isTeen(){
        return this.age>12&&this.age<20;
    }


    public String getFullName(){
        if(this.firstName==""&&this.lastName==""){
            return "";
        }else if(this.firstName==""){
            return this.lastName;
        }else if(this.lastName==""){
            return this.firstName;
        }else{
            return firstName+" "+lastName;
        }

    }
}

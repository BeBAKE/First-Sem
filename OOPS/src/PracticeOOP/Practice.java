package PracticeOOP;
// using setters and getters to limit what user can put in the values of the variables of the objects

class Bank{
    long accountNumber;
    String holderName;
    String email;
    long phNo;

    //setting up setters.

    //setter for accountNumber
    public void setAccountNumber(long number){
        if(number>='a' && number <= 'z' || number<=99999999999l){
            System.out.println("Invalid format");
        }else{
            this.accountNumber = number;
        }
    }
    //setter for HolderName
    public void setHolderName(String name){
        this.holderName=holderName;
    }
    //setter for email
    public void setEmail(String mail){
        this.email=mail;
    }
    //setter for phone number
    public void phoneNumber(long num){
        if(num>='a' && num <= 'z' || num<=999999999l && num>=9999999999l){
            System.out.println("Invalid format");
        }else{
            this.phNo = num;
        }
    }

    //getter for all
    public void customerInformation(){
        System.out.println(this.accountNumber+"\n"+this.holderName+"\n"+this.email+"\n"+
                this.phNo);
    }
}

public class Practice {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.accountNumber=0331041000003337l;
        b1.email="vivekcharak004@gmail.com";
        b1.phNo=8082048732l;
        b1.holderName="Vivek Singh";

        b1.customerInformation();

    }
}

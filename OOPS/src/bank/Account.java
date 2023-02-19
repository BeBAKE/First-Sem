package bank;



public class Account {
    public String holderName;//Public
    String email;               //Default
    private String password;    //Private
    protected int age;

    //setter for password
//    void Setpassword
      void run(){
        System.out.println("murga starts running");
    }


}

class BankTester extends Account{  // Local function to test the functionality of Bank's software
    void testRunning(Account obj){
        run();
    }
    public static void main(String[] args) {
        Account a1 = new Account();

    }
}



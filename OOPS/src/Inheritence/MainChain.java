package Inheritence;

public class MainChain {

// Constructor 1
    public MainChain(){
        this(3,5);
        System.out.println("constructor 1");
    }

    // Constructor 2
    public MainChain(double x , double y){
        this(x);
        System.out.println("Constructor 2 : "+x+" "+y);
    }

    // Constructor 3
    public MainChain(double x){
        System.out.println("final Constructor called");
    }


                //  TESTER

    public static void main(String[] args) {
        MainChain m1 = new MainChain();

    }





}


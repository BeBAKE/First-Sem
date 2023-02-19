package DSA.Recursion;

public class program2 {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){

        // base condition.
        if (n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);


        // if we are calling a function again and again , we can treat it as a
        // separate call in the stack for each calling.
        // One time will come when memory of computer will exceed the limit -> Stackoverflow error.


        //This is called tail recursion
        //this is the last function call.
        print(n+1);  //recursive call
    }
}

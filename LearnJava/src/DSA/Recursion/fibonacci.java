package DSA.Recursion;

public class fibonacci {
    public static void main(String[] args) {
        long ans=fibonacci(50);

        System.out.println(ans);

    }

    static long fibonacci(int n){
        if(n<2){
            return n;
        }

        //This is not tail recursion because here we have two additional steps
        // addition and then return.
        return fibonacci(n-1)+ fibonacci(n-2);
    }
}

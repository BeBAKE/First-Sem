package DSA.Recursion;

//We have used a process called memoization to optimize the code.

import java.util.Arrays;

public class FastFibonacci {

    private static long[] fiboContainer; // it is defined outsite of any function because now we can use it anywhere without
                             // any need of making it a parameter of fibonacci() .
    public static void main(String[] args) {
        int n=50;
        fiboContainer = new long[n+1];

        System.out.println(fibonacci(n)+" ");
        System.out.println();
        System.out.println(Arrays.toString(fiboContainer));
    }

    private static long fibonacci(int n) {

        //base condition
        if(n<2){
            return n;
        }
        if(fiboContainer[n]!=0){  // Reason why we used "0" and not "null" here is , primitive datatype don't have any null value.
            return fiboContainer[n];
        }


        long fiboNumber = fibonacci(n-1)+fibonacci(n-2);
        fiboContainer[n]=fiboNumber;

        return fiboNumber;

    }
}

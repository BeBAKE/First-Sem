package DSA.Recursion;

//We have used a process called memoization to optimize the code.

import java.util.Arrays;

public class FastFibonacci {

    private static long[] fiboCache; // it is defined outsite of any function because now we can use it anywhere without
                             // any need of making it a parameter of fibonacci() .
    public static void main(String[] args) {
        int n=50;
        fiboCache = new long[n+1];

        System.out.println(n+"th fibonacci number is "+fibonacci(n)+" ");
        System.out.println();
        System.out.println(Arrays.toString(fiboCache));
    }

    private static long fibonacci(int n) {

        //base condition
        if(n<2){
            return n;
        }
        if(fiboCache[n]!=0){  // Reason why we used "0" and not "null" here is , primitive datatype don't have any null value.
            return fiboCache[n];
        }


        long fiboNumber = fibonacci(n-1)+fibonacci(n-2);
        fiboCache[n]=fiboNumber;

        return fiboNumber;

    }

    // return, returns the value to the last caller .
}

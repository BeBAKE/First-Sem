package DSA.Recursion;

import java.util.Arrays;

public class SumTriangleArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n=arr.length;
        triArray(arr,n);
    }
    public static void triArray(int[] arr, int n){
        // n is the size of the array.
        if(n==1) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        int[] tempArr=new int[n-1];
        for(int i=0;i<tempArr.length;i++){
            tempArr[i]=arr[i]+arr[i+1];
        }

        triArray(tempArr, n-1);
        System.out.println(Arrays.toString(arr));
    }
}

package DSA.Recursion2;

import java.util.Arrays;

public class BubbleSort {

    static void sort(int[] arr){
        if(arr.length==0){
            return;
        }
        help(arr,0,arr.length-2);
    }

    //col -> arr.length-2 to 0
    //row -> 0 to c
    private static void help(int[] arr, int row , int col){
        if(col<0)  //base condition
            return;
        int temp;
        if(arr[row]>arr[row+1]){
            temp=arr[row];
            arr[row]=arr[row+1];
            arr[row+1]=temp;
        }
        if(row<col){
            help(arr,row+1,col);
        }else{
            help(arr,0,col-1);
        }


    }
    public static void main(String[] args) {
        int[] arr = {3,5,8,-78,86,4,6,62,0,2,73,389,93,36,6,74,-2,3,-3,3,-2,2,5,9};
        int[] arr2= {0,-1};
        sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}

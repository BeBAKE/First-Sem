package DSA.Recursion2;

import java.util.Arrays;

public class SelectionSort {
    public static void selection(int[] arr){
        if(arr.length<=1){
            return;
        }
        help(arr,0,arr.length-1,0);
    }

    private static void help(int[] arr, int row, int col,int maxIndex) {
        if(col==0){
            return;
        }
        //This if is checking for max index from 0 to col
        if(arr[maxIndex]<arr[row]){
            maxIndex=row;
        }
        //This if recurse row from 1 to col for the upper if to check for max index from row 0 to col
        if(row<col){
            help(arr,row+1,col,maxIndex);
        }else{        //when row and col are same (that is max index from row= 0 to col ,has been found) then it's time to swap max index with col and decrement of col
            swap(arr,maxIndex,col);
            help(arr,0,col-1,0);
        }

    }

    private static void swap(int[] arr, int maxIndex, int col) {
        int temp=arr[col];
        arr[col]=arr[maxIndex];
        arr[maxIndex]=temp;
    }

    public static void main(String[] args) {
        int[] arr={3,5,8,-78,86,4,6,62,0,2,73,389,93,36,6,74,-2,3,-3,3,-2,2,5,9};
        //int[] arr={};
        int[] arr2={74,-2,3,-3,3,-2,2,5,9};
        System.out.println(Arrays.toString(arr2));
        selection(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}

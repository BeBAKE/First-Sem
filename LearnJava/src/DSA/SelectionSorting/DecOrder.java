package DSA.SelectionSorting;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class DecOrder {
    public static void main(String[] args) {
        int[] arr={23,2,123,54,67,86,4};
        selectionSorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSorting(int[] arr){
        for(int i = 0;i<arr.length;i++){
            int last=arr.length-i-1;
            int min=getMin(arr,last);
            swap(arr,min,last);
        }
    }

    // function to fetch index of minimum element of an array
    static int getMin(int[] arr,int end){
        int minIndex=0;
        for(int i=0 ;i<=end;i++){
            if(arr[minIndex]>arr[i]){
                minIndex=i;
            }
        }return minIndex;
    }

    //function to swap the minimum element with last as the program follows
    static void swap(int @NotNull [] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}

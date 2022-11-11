package DSA.Sorting;

import java.util.Arrays;

public class SelectionSorting {
    public static void main(String[] args) {
        int[] arr= {22,241,-34,2,0,234,35,57,54,86,2,75};
        int[] arr2 ={1,2,3,4,5,6,9,8};
        int[] arr3 ={};
        selectionSorting(arr3);
        System.out.println(Arrays.toString(arr3));
    }
    public static void selectionSorting(int[] arr){
        for(int i=arr.length-1 ; i>0 ; i--){
            int maxIndex=getMax(arr,i);
            swapper(arr,i,maxIndex);
        }
    }
    public static int getMax(int[] arr, int limit){
        int max = arr[0], index=0;
        for(int i =0; i<=limit ; i++){
            if(max<arr[i]){
                max=arr[i];
                index=i;
            }
        }
        return index;
    }
    public static void swapper(int[] arr,int i ,int maxIndex){

        int temp=arr[i];
        arr[i]=arr[maxIndex];
        arr[maxIndex]=temp;
    }
}

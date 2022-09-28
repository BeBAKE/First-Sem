package DSA.SelectionSorting;

import java.util.Arrays;

public class IncreasingOrder {

    public static void main(String[] args) {
        int[] array={2,32,1,3,6,76,999};
        selectionSorting(array);
        System.out.println(Arrays.toString(array));
    }
    static void selectionSorting(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int max=getMax(arr,last);
            swap(arr,max,last);
        }
    }
    static int getMax(int[] arr,int end){
        int maxIndex =0;
        for(int i=0;i<=end;i++){
            if(arr[maxIndex]<arr[i]){
                maxIndex=i;
            }
        }
        return maxIndex;
    }
    static void swap(int[] arr2,int first,int second){
        int temp=arr2[first];
        arr2[first]=arr2[second];
        arr2[second]=temp;
    }

}


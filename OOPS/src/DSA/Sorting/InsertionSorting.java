package DSA.Sorting;

import java.util.Arrays;

public class InsertionSorting {
    public static void main(String[] args) {
        int[] arr= {2,4,6,8,7};
        int[] arr2={22,241,-34,2,0,234,35,57,54,86,2,75};
        insertionSorting(arr2);
        System.out.println(Arrays.toString(arr2));
    }
    public static void swapping(int[] arr, int limit){
//        boolean swapped=false;
        for(int i=limit; i>0 ;i--){
            if(arr[i]<arr[i-1]){
                int temp=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
//                swapped=true;
            }else
                break;
//            if(!swapped)
//                break;
//            swapped=false;
        }
    }
    public static void insertionSorting(int[] arr){
        for(int i=1;i<arr.length;i++){
            swapping(arr,i);
        }
    }
}

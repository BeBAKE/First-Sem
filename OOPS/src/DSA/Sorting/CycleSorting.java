package DSA.Sorting;

import java.util.Arrays;

public class CycleSorting {
    public static void main(String[] args) {
        int[] arr= {3,1,5,4,2,6};
        int[] arr2={1,5,7,4,4,11,9,6,8,10,2,0};
        cycleSorting(arr2);
        System.out.println(Arrays.toString(arr2));
    }
    public static void cycleSorting(int[] arr){
        if(maxElement(arr)!=arr.length){
            System.out.println("not a valid condition of array for cycle sorting");
            return;
        }
        int i=0 ;
        while(i<arr.length){
            if(arr[i]!=i+1) {
                swapping(arr, i, arr[i] - 1);
            }else{
                i++;
            }
        }
    }
    public static void swapping(int[] arr,int index,int newIndex){  // index is the current index of the
                    //  value , new index is (value - 1)th index
        int temp=arr[index];
        arr[index]=arr[newIndex];
        arr[newIndex]=temp;
    }
    public static int maxElement(int[] arr){
        int max=arr[0];
        for(int i : arr){
            if(max<i)
                max=i;
        }
        return max;
    }
}

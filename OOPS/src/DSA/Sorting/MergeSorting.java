package DSA.Sorting;

import java.util.Arrays;

public class MergeSorting {

    static int[] mergeSort(int[] arr){
        if(arr.length<=1){
            return arr;
        }
        int mid=arr.length/2;

        int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(right,left);
    }

    private static int[] merge(int[] left, int[] right) {
        int i=0,j=0,k=0;
        int[] merged=new int[left.length+right.length];
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                merged[k]=left[i];
                i+=1;
            }else{
                merged[k]=right[j];
                j+=1;
            }
            k+=1;
        }
        while(i<left.length){
            merged[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            merged[k]=right[j];
            j++;
            k++;
        }
        return merged;
    }


    public static void main(String[] args) {
        int[] arr= {5,4,3,2,1};
        int[] arr2={1,5,7,4,4,11,9,6,8,10,2,0};
        int[] arr3={3,-3};
        int[] ans=mergeSort(arr2);
        System.out.println(Arrays.toString(ans));

    }
}

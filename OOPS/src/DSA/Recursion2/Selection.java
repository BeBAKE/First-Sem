package DSA.Recursion2;

import java.util.Arrays;

public class Selection {
    private static int maxIndex(int[] arr,int end){
        int max=0;
        for(int i=0;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    static void sort(int[] arr){
        if(arr.length==0){
            return;
        }
        for(int i = arr.length-1;i>0;i--){
            int max=maxIndex(arr,i);
            if(arr[max]!=arr[i])
                swap(arr,max,i);
        }
    }


    public static void main(String[] args) {
        int[] arr = {3,5,8,-78,86,4,6,62,0,2,73,389,93,36,6,74,-2,3,-3,3,-2,2,5,9};
//        int[] arr2={7};
//        int ans= maxIndex(arr2,arr2.length);
//        System.out.println(arr2[ans]);
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
        String str;
    }
}

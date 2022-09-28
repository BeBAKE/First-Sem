package DSA.BinarySearching;

import java.util.Arrays;

public class CheckDouble {
    public static void main(String[] args) {
        int[] arr={-20,8,-6,-14,0,-19,14,4};
        boolean ans = ifExist(arr);
        System.out.println(ans);

    }
    public static boolean ifExist(int[] arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(binarySearch(arr,arr[i]*2,i))
                return true;
        }
        return false;

    }

    public static boolean binarySearch(int[] arr, int target, int index) {
        int start=0 , end = arr.length-1 , mid;
        while(start<=end){
            mid = start+(end-start)/2;
            if(arr[mid]==target && mid != index)
                return true;
            if(arr[mid]<target)
                start=mid+1;
            else
                end=mid-1;
        }
        return false;
    }
}

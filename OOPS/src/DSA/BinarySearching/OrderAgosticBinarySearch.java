package DSA.BinarySearching;

public class OrderAgosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {-23,1,3,4,12,27,33,43,44,55,65};
        int[] arr2 = {213,102,92,82,72,23,2,-12,-234,-2232};
        System.out.println(Binary(arr,4374));
        System.out.println(Binary(arr2,3493));


    }
     static int Binary(int[] arr, int target){
        int start = 0;
        int end =arr.length-1;

        // to check if array is in ascending or descending order.

        boolean isAscen = arr[start]<arr[end];

        while(start<=end){
            int mid = start+(end-start)/2;

            // Same for asc and desc array

            if (target==arr[mid]){
                return mid;
            }
        // for ascending ordered arrays
            if (isAscen){
                if (target<arr[mid]){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
        // for descending ordered arrays
            }else{
                if (target<arr[mid]){
                    start = mid+1;
                }else {
                    end = mid-1;
                }
            }
        }
        return -1;
     }
}

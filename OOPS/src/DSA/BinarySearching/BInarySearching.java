package DSA.BinarySearching;

// We are assuming the array to be sorted beforehand.

public class BInarySearching {
    public static void main (String[] args){
        int[] arr = {-23,1,3,4,12,27,33,43,44,55,65};
        int target = 27;
        System.out.println(binarySearch(arr,target));


    }
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+ (end - start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start = mid +1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}

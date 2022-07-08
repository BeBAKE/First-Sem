package DSA.BinarySearching;

public class DecBinarySearch {
    public static void main (String[] args){
        int[] arr = {213,102,92,82,72,23,2,-12,-234,-2232};
        System.out.println(BinarySearch(arr,-2232));

    }
    static int BinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+ (end-start)/2;
            if (target>arr[mid]){
                end=mid-1;
            }else if (target<arr[mid]){
                start = mid+1;
            }else
                return mid;
        }
        return -1;
    }

}


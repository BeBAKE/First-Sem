package DSA.Recursion;

public class RecursiveBinarySearching {
    public static void main(String[] args) {
        int[] arr={-8,-6,1,4,6,12,22,34,56};
        int ans=binarySearching(arr,7,0,arr.length-1);
        System.out.println(ans);

    }
    static int binarySearching(int[] arr, int target, int start,int end){

        if(start>end) {
            return -1;
        }
        int mid=start+(end-start)/2;

                      // without return statement with the call of binarySearch.
//        if(target==arr[mid])
//            return mid;
//        if(target>arr[mid])
//            binarySearching(arr,target,mid+1,end);
//        else
//            binarySearching(arr,target,start,mid-1);
//        return mid;

                    //With return statement with the call of binarySearching.
        if(target==arr[mid])
            return mid;

        if(target>arr[mid])
            return binarySearching(arr,target,mid+1,end);

        return binarySearching(arr,target,start,mid-1);

    }
}

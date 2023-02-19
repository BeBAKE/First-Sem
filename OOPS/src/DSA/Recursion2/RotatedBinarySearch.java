package DSA.Recursion2;

public class RotatedBinarySearch {

    static int searching(int[] arr, int start , int end, int target){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        /* if first half is sorted
        that is arr[start....mid]
         */
        if(arr[start]<=arr[mid]){
            /* Check if it is in this sorted half or other*/
            if(arr[start]<=target && arr[mid]>=target){
                return searching(arr,start,mid-1,target);
            }

            return searching(arr,mid+1,end,target);
        }

        // If first half is not sorted then this half is sorted
        if(arr[mid]<target && arr[end]>=target){
            return searching(arr,mid+1,end,target);
        }

        return searching(arr,start,mid-1,target);

    }

    public static void main(String[] args) {
        int[] arr= {5,7,8,9,10,1,2,4};
        int ans = searching(arr,0,7,7);
        System.out.println(ans);
    }
}

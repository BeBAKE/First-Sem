package DSA.BinarySearching;

//Finding number of times an array has been rotated
public class RotationCount {
    public static void main(String[] args) {
        int[] arr1= {15, 18, 2, 3, 6, 12};
        int[] arr2 = {7, 9, 11, 12, 5};
        int[] arr3 = {5,7, 9, 11, 12};
        int ans= pivot(arr3);
        System.out.println(ans);
        System.out.println(pivot(arr2));
        System.out.println(pivot(arr1));
    }
    static int pivot(int[] arr){
        int start=0,end=arr.length-1,mid;
        if(arr[start]<arr[end] || arr.length==1)
            return 0;
        while(start!=end){
            mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
                return mid+1; // mid returns the index of pivot , mid+1 gives our answer
            else
                if(arr[start]>arr[mid])
                    end=mid-1;
                else
                    start=mid+1;
        }
        return start+1;
    }
}

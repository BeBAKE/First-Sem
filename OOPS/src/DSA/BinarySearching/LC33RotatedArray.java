package DSA.BinarySearching;

// Array has a presence of Pivot
public class LC33RotatedArray {
    public static void main(String[] args) {
        int[] arr1 = {4,5,6,7,0};
        int[] arr2= {3,6,1};
        int[] arr3 = {66,67,7,10,14,19,27,33,36,40,44,54,60};
        int ans=search(arr3,7);
        System.out.println(ans);
        System.out.println(pivot(arr3));
    }
    static int pivot(int[] nums){
        int start=0,end=nums.length-1,mid;
        if(nums[start]<nums[end])
            return -1;
        while(start!=end){
            mid=start+(end-start)/2;
            if(nums[mid]>nums[mid+1])
                return mid; // answer found
            else
                if(nums[start]>nums[mid]) // means mid is on the right side of peak so end needs to go left
                    end=mid-1;
                else
                    start=mid+1; // means mid is on the left side of the peak so start needs to go right
        }
        return start;
    }
    static int search(int[] nums, int target) {
        int peakValueIndex= pivot(nums);
        int firstHalf=searching(nums,target,0,peakValueIndex);
        if(firstHalf!=-1)
            return firstHalf;
        else
            return searching(nums,target,peakValueIndex+1,nums.length-1);
    }

    static int searching(int[] nums, int target,int start,int end) {
        int mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(nums[mid]>target)
                end=mid-1;
            else if(nums[mid]<target)
                start=mid+1;
            else
                return mid;
        }
        return -1;
    }
}

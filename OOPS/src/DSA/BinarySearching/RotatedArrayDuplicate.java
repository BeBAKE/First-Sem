package DSA.BinarySearching;
// 🔴🔴🔴🔴🔴🔴🔴🔴🔴🔴🔴🔴  this needs correction  🔴🔴🔴🔴🔴🔴🔴🔴🔴🔴🔴🔴
public class RotatedArrayDuplicate {
    public static void main(String[] args) {
        int[] arr1 = {0,2,3,5,5,7};
        int[] arr2= {2,9,2,2,2};
        boolean ans=search(arr1,6);
        int peakValue= pivot(arr1);
        System.out.println(peakValue);
    }
    static int pivot(int[] nums){
        int start=0,end=nums.length-1,mid;
//        if(nums[start]<nums[end])
//            return -1;
//        while(start!=end){
//            mid=start+(end-start)/2;
//            if(nums[mid]>nums[mid+1])
//                end=mid; // answer found
//            else
//            if(nums[start]>nums[mid]) // means mid is on the right side of peak so end needs to go left
//                end=mid-1;
//            else
//                start=mid; // means mid is on the left side of the peak so start needs to go right
//        }
//        return start;
        while(start<=end){
            mid=start+(end-start)/2;
            // 4 cases
            if(nums[mid]>nums[mid+1] && mid<end)
                return mid;
            if(nums[mid]<nums[mid-1] && mid>start)
                return mid-1;
        //below code will not work when there are duplicate values
//            else if(nums[mid]<=nums[start])
//                end=mid-1;
//            else
//                start=mid+1;
            if(nums[start]==nums[mid] && nums[end]==nums[mid]){
                //we can do start++ and end-- but first we have to check if these are not pivot
                if(start<end && nums[start]>nums[start+1])
                    return start;
                start++;
                end--;
            }else if(nums[mid]<=nums[start])
                end=mid-1;
            else
                start=mid+1;
        }return 0;        // 🔴🔴🔴🔴🔴🔴🔴🔴🔴need correction here🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥
    }
    static boolean search(int[] nums, int target) {
        int peakValueIndex= pivot(nums);
        if(searching(nums,target,0,peakValueIndex))
            return true;
        else
            return searching(nums,target,peakValueIndex+1,nums.length-1);
    }

    static boolean searching(int[] nums, int target,int start,int end) {
        int mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(nums[mid]>target)
                end=mid-1;
            else if(nums[mid]<target)
                start=mid+1;
            else
                return true;
        }
        return false;
    }
}

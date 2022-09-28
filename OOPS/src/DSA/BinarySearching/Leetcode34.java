package DSA.BinarySearching;

import java.util.Arrays;

// first and last occurance of target element in increasing sorted array
public class Leetcode34 {

    public static void main(String[] args) {
        int[] nums = {5,7,7,7,7,8,8,10};
//        int[] nums = {4,5,5,5,8,8,8,8,8,10,10,10};
//        int[] nums = {2};

        System.out.println(Arrays.toString(searchRange(nums,78)));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        ans[0]=firstOccurance(nums,target,true);
        ans[1]=firstOccurance(nums,target,false);
        return ans;
    }

    static int firstOccurance(int[] nums, int target, boolean isfirst) {
        int answer=-1,start=0,end=nums.length-1,mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(target>nums[mid])
                start=mid+1;
            else if(target<nums[mid])
                end=mid-1;
            else{
                answer=mid;
                if(isfirst)
                    end=mid-1;
                else
                    start=mid+1;
            }
        }
        return answer;
    }


//    static int[] searchRange(int[] nums, int target) {
//        int start=0,end=nums.length-1,mid;
//        int[] ans={-1,-1};
//
//        // for last occurance.
//        while(start<=end){
//            mid=start+(end-start)/2;
//            if(target>nums[mid]){
//                start=mid+1;
//            }else if(target<nums[mid]){
//                end=mid-1;
//            }else{
//                ans[1]=mid;
//                start=mid+1;
//            }
//        }
////        if(target!=ans[1]){
////            return new int[]{-1,-1};
////        }
//
//
//        start=0;end=nums.length-1;
//        while(start<=end){
//            mid=start+(end-start)/2;
//            if(target<nums[mid]){
//                end=mid-1;
//            }else if(target>nums[mid]){
//                start=mid+1;
//            }else{
//                ans[0]=mid;
//                end=mid-1;
//            }
//        }
//
//
//        return ans;
//    }

}

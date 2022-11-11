package DSA.Recursion;

public class Del {
    public static void main(String[] args) {
        int[] arr={-8,-6,1,4,6,12,22,34,56};
        int ans=search(arr,6,0,arr.length-1);
        System.out.println(ans);

    }
    static int search(int[] nums, int target,int start,int end) {
        if(start>end)
            return -1;
        int mid=start+(end-start)/2;
        if(nums[mid]==target)
            return mid;
        if(nums[mid]>target)
            return search(nums,target,start,mid-1);
        return search(nums,target,mid+1,end);
    }
}

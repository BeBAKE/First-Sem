package DSA.BinarySearching;

//Finding peak value in mountain array
public class LC1084FindInMt {
    public static void main(String[] args) {
        int[] arr1 = {1,2,4,5,3,1};
        int[] arr2 = {0,1,2,4,2,1};
        System.out.println(finder(arr2,2));
    }
    static int peak(int[] arr){
        int start=0,end=arr.length-1,mid;
        while(start!=end){
            mid=start+(end-start)/2;
            if(arr[mid+1]<arr[mid])
                end=mid;
            else
                start=mid+1;
        }
        return start;
    }
    static int finder(int[] nums,int target){
        int save=peak(nums);
        int start=0,end=save,mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(target<nums[mid])
                end=mid-1;
            else if(target>nums[mid])
                start=mid+1;
            else
                return mid;
        }
        start=save;
        end=nums.length-1;

        while(start<=end){
            mid=start+(end-start)/2;
            if(target>nums[mid])
                end=mid-1;
            else if(target<nums[mid])
                start=mid+1;
            else
                return mid;
        }return -1;
    }
}

package DSA.Sorting;

import java.util.Arrays;

public class LC645SetMismatch {
    public static void main(String[] args) {
        int[] arr={2,2};
        int[] arr2={2,1,4,2,6,5};
        int[] ans=findErrorNums(arr2);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]!=i+1 && nums[i]!=nums[nums[i]-1]){
                swapping(nums,i,nums[i]-1);
            }else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                return new int[]{nums[j],j+1};
            }
        }
        return new int[]{-1,-1};
    }
    static void swapping(int[] arr,int index, int nextIndex){
        int temp=arr[index];
        arr[index]=arr[nextIndex];
        arr[nextIndex]=temp;
    }
}

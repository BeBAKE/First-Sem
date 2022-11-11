package DSA.Sorting;

import java.util.Arrays;

public class LC287RepeatedNumber {
    public static void main(String[] args) {
        int[] arr={1,3,4,2,2};
        int[] arr2={1,1};
        System.out.println(findDuplicate(arr2));
    }
    public static int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]!=i+1){
                if(nums[nums[i]-1]!=nums[i]) //checking whether the numbers we are swapping are same or not
                    swapping(nums,i,nums[i]-1);//if both numbers are same then else condition will follow.
                else
                    return nums[i];
            }else{
                i++;
            }
        }

        return nums[nums.length-1];
    }

    static void swapping(int[] arr,int index, int nextIndex){
        int temp=arr[index];
        arr[index]=arr[nextIndex];
        arr[nextIndex]=temp;
    }
}

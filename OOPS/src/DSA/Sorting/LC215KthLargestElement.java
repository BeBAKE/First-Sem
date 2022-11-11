package DSA.Sorting;

import java.util.Arrays;

public class LC215KthLargestElement {
    public static void main(String[] args) {
        int[] arr={99,99};
        int[] arr2={3,2,3,1,2,4,5,5,6};
        int ans=findKthLargest(arr,1);
//        int ans2=findKthLargest(arr2,4);
        System.out.println(ans);
    }
    public static int findKthLargest(int[] nums,int k) {
        cycleSorting(nums);
        int maxIndex=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                maxIndex=i-1;
            }
        }return nums[maxIndex-k];

    }
    static void cycleSorting(int[] arr){
        int i=0,len=arr.length;
        while(i<len){
            if(arr[i]>0 && arr[i]<len && arr[i]!=i+1 && arr[i]!=arr[arr[i]-1]){
                swap(arr,i,arr[i]-1);
            }else
                i++;
        }
    }

    static void swap(int[] arr,int index,int preIndex){
        int temp=arr[index];
        arr[index]=arr[preIndex];
        arr[preIndex]=temp;
    }
}

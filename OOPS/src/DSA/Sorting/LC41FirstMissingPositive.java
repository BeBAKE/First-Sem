package DSA.Sorting;

public class LC41FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        int[] arr2 ={1,1};
        int[] arr3 ={7,8,9,11,12};
        int ans=firstMissingPositive(arr2);
        System.out.println(ans);
    }
    public static int firstMissingPositive(int[] nums) {
       int i=0;
       while(i<nums.length){
           if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=i+1){
               if(nums[i]!=nums[nums[i]-1])
                   swapping(nums,i,nums[i]-1);
               else
                   i++;
           }else
               i++;
       }
       for(int j=0;j<nums.length;j++){
           if(nums[j]!=j+1)
               return j+1;
       }
       return nums.length+1;
    }

    static void swapping(int[] arr,int index, int nextIndex){
        int temp=arr[index];
        arr[index]=arr[nextIndex];
        arr[nextIndex]=temp;
    }
}

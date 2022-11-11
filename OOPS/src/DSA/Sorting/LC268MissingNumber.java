package DSA.Sorting;

public class LC268MissingNumber {
    public static void main(String[] args) {
        int[] arr={0,1};
        int missing=missingNumber(arr);
        System.out.println(missing);
    }
    public static int missingNumber(int[] nums) {
        cycleSort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i)
                return i;
        }
        return nums.length;
    }
    static void cycleSort(int[] arr){
        int i=0;
        while(i<arr.length){
            if(arr[i]!=i && arr[i]!=arr.length){
                swapping(arr,i,arr[i]);
            }else{
                i++;
            }

        }
    }
    static void swapping(int[] arr,int index, int nextIndex){
        int temp=arr[index];
        arr[index]=arr[nextIndex];
        arr[nextIndex]=temp;
    }

}

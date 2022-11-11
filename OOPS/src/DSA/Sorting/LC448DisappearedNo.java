package DSA.Sorting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC448DisappearedNo {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        int[] arr2={1,1};
        List<Integer> list=findDisappearedNumbers(arr2);
        System.out.println(list);

    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ls= new ArrayList<>(10);
        // Sorting with duplicate numbers
        int i=0;
        while(i<nums.length){
            if(nums[i]!=i+1 && nums[i]!=nums[nums[i]-1]){
                  // nums[i]!=nums[nums[i]-1] means duplicate numbers should be swapped
                swapping(nums,i,nums[i]-1);
            }else{
                i++;
            }
        }
        //Checking for the indices
        for(int j=0;j<nums.length;j++){
            if(j+1!=nums[j])
                ls.add(j+1);
        }
        return ls;
    }
    static void swapping(int[] arr,int index, int nextIndex){
        int temp=arr[index];
        arr[index]=arr[nextIndex];
        arr[nextIndex]=temp;
    }
}

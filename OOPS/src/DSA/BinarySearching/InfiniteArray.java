package DSA.BinarySearching;

import java.util.Arrays;

public class InfiniteArray {
    public static void main(String[] args) {

        int[] eg=new int[100];
        for (int i=0;i<100;i++){
            eg[i]=4;
        }
        System.out.println(Arrays.toString(eg));
        System.out.println(binarySearch(eg,4));

    }

    // Start , end and mid are indices for array arr.
    static int[] range(int[] arr,int target){
        int start=0,end=1,temp;
//        while(true){
//            if(arr[end]>=target){
//                return new int[]{start,end};
//            }else{
//                start=end+1;
//                end*=2;
//            }
//        }
        while(arr[end]<target){
            temp=end+1;
            end=end+(end-(start-1))*2; // end - (start + 1) gives the size of the box
            // end + (size of box * 2)
            start=temp;
        }return new int[]{start,end};
    }


    static int binarySearch(int[] arr,int target) {

        int[] ans =range(arr,target);
        int start = ans[0], end = ans[1];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}

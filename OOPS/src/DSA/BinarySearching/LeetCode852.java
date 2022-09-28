package DSA.BinarySearching;

//Finding peak in mountain array ( increases upto a number the starts decreasing )
public class LeetCode852 {
    public static void main(String[] args) {
        int[] arr1 = {0,1,0};
        int[] arr2 = {0,5,6,10,88,7,5,3,2,0};
        int[] arr3 = {0,10,5,2};
        int[] arr4 ={3,5,3,2,0};
        int ans=mountainPeak(arr1);
        System.out.println(ans);
    }
    static int mountainPeak(int[] arr){
//        int start=0,end=arr.length-1,mid,ans=0;
//        while(start<=end){
//            mid=start+(end-start)/2;
//            if(mid!=0 && mid!=arr.length-1){
//                if(arr[mid-1]>arr[mid] && arr[mid+1]<arr[mid])
//                    end=mid-1;
//                else if(arr[mid-1]<arr[mid] && arr[mid+1]>arr[mid])
//                    start=mid+1;
//                else
//                    return mid;
//            }else{
//                if(mid==0)
//                    return mid+1;
//                else if (mid==arr[arr.length])
//                    return mid-1;
//            }
//
//        }
//        return ans;
        int start=0,end=arr.length-1,mid;
        while(start!=end){
            mid=start+(end-start)/2;
            if(arr[mid+1]<arr[mid])
                //this is the decreasing part of the array
                //this may be the answer
                //that is why I am using end = mid not ( end = mid - 1 )
                end=mid;
            else
                start=mid+1;
        }
        // in the end start==end and both are pointing to the largest number
        // after the two checks
        return start;
    }
}

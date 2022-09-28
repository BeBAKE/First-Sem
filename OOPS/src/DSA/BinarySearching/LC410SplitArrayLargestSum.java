package DSA.BinarySearching;

public class LC410SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int[] arr2= {1,2,3,4,5};
        int[] arr3 ={1,4,4 };
        int m=2;
        int ans = splitArray(arr2,m);
        System.out.println(ans);

    }
    // m is number of splits asked
    // k is the number of splits done by programme.

    public static int splitArray(int[] nums, int m) {
        int n=nums.length;
        // 3 cases
        if(m==1){
            int sum=0;
            for(int i=0;i<nums.length;i++){
                sum+=nums[i];
            }return sum;
        }else if(m==n){
            int max=nums[0];
            for(int i=0;i<nums.length;i++){
                if(max<nums[i])
                    max=nums[i];
            }return max;
        }else
            return thirdCase(nums,m);
    }



    public static int thirdCase(int[] nums,int m){

        //startValue = (when N splits ) max element in one array
        //endValue = (when 1 split ) sum of elements
        int endValue=0,startValue=nums[0];
        for(int i=0;i<nums.length;i++){
            endValue+=nums[i];
            if(startValue<nums[i])
                startValue=nums[i];
        }
//        int len = endValue-startValue+1;
//        //Created array of potential answers
//        int[] potentialAnsArr =ansArray(startValue,endValue,len);

        int start=startValue ,end=endValue;
//        int end=len-1;
        while(start!=end){
            //mid for potentialAnsArr array
            int mid=start+(end-start)/2;
            // creating programme made splits k
            int sum =0, k=1;
            for(int i = 0; i<nums.length; i++){
                sum+=nums[i];
                if(sum>mid){
                    sum=nums[i];
                    k++;
                }
            }
            // comparing k with m to know where to go in the ansArray
            if(k<=m){
                end=mid;
            }else
                start=mid+1;
        }
        return end;

    }
//    //this will give the potential answer from the array of [ max element in one array - sum of elements ]
//    public static int[] ansArray(int start,int end,int len){
//        int[] arr =new int[len];
//        for(int i=0;i<len;i++){
//            arr[i]=start+i;
//        }
//        return arr;
//    }

}

public class WIldCard {
    public static void main(String[] args) {
        int[] arr= {2,3,5,9,14,16,18};
        int[] arr2 ={563,444,231,109,58,44,43,32};
        int[] arr3={1,5,7,14,16,18};
//        System.out.print("Enter the target element : ");
//        int target=sc.nextInt();
        int ans = binarySearching(arr2,100);

        System.out.println(ans);



    }


    static int binarySearching(int[] arr,int target){
        boolean isAsc= arr[0]<arr[arr.length-1];
        int start=0,end=arr.length-1,mid;

        while(start<=end){

            mid=start+(end-start)/2;

            if(target==arr[mid])
                return mid;

            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                }else if(target>arr[mid]){
                    start=mid+1;
                }
            }
            else{
                if(target<arr[mid]){
                    start=mid+1;
                }else if(target>arr[mid]){
                    end=mid-1;
                }
            }
        }


        if(isAsc){
            return end;
        }else{
            return start;
        }


    }




}

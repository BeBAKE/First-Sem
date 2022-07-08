package DSA.BinarySearching;

public class CielingQuestion {
    public static void main (String[] args){

        int[] arr= {2,3,5,9,14,16,18};
        int[] arr2 ={563,444,231,109,58,44,43,32};
        System.out.println(Cieling(arr,1));
//        System.out.println(Cieling(arr2,6));

    }
    static int Cieling(int[] arr, int target ){
        int start = 0;
        int end = arr.length-1;

        boolean isAscen = arr[start]<arr[end];

        while(start<=end){
            int mid = start+(end-start)/2;
            if (target==arr[mid]){
                return mid;
            }
            if(isAscen){
                if(target<arr[mid]){
                    end =mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(target>arr[mid]){
                    end =mid-1;
                }else{
                    start = mid+1;
                }
            }

        }
        if(isAscen){
            return start;
        }
        else{
            return end;
        }
    }
}

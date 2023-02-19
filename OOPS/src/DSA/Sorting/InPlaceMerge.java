package DSA.Sorting;
import java.util.Arrays;

public class InPlaceMerge {

    static void merge(int[] arr){
        if(arr.length<=1){
            return ;
        }

        divide(arr,0,arr.length-1);


    }

    private static void divide(int[] arr, int start, int end) {

        if(start>=end){
            return;
        }

        int mid=start+(end-start)/2;

        divide(arr,start,mid);
        divide(arr,mid+1,end);

        conquere(arr,start,mid,end);


    }

    private static void conquere(int[] arr, int start, int mid, int end) {
        int i=start,j=mid+1,k=0;
        int[] merger=new int[end-start+1];
        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                merger[k]=arr[i];
                i++;
            }else{
                merger[k]=arr[j];
                j++;
            }k++;
        }
        while(i<=mid){
            merger[k]=arr[i];
            i++;
            k++;
        }
        while(j<=end){
            merger[k]=arr[j];
            j++;
            k++;
        }

        i=start;
        k=0;
        while(i<=end){
            arr[i]=merger[k];
            i++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr={-2,-3,0,0,-3,10002,-100002,1825,2};
        int[] arr1={5,3,7,2,4,1};
        System.out.println(Arrays.toString(arr));
        merge(arr);
        System.out.println(Arrays.toString(arr));
    }
}

package DSA.InsertionSorting;

import java.util.Arrays;


//   My own code for insertion sorting
public class IncOrder {
    public static void main(String[] args) {
       int[] arr={7,12,-3,4,11,2,232,-3,7,8};
       insertionSorting(arr);
       System.out.println(Arrays.toString(arr));
    }

    static void insertionSorting(int[] arr){

        for(int i=1;i<arr.length;i++){
            checker(arr,i,arr[i]);

        }
    }

    //Function to check which position target element is going to be in.
    //current is the target element, j is its index value
    static void checker(int[] arr, int j, int current){
        for(int i=0;i<j;i++){
            if(current<arr[i]){
                pusher(arr,i,current,j);
                break;
            }
        }
    }

    //Function to push elements one index ahead and set the target element in its right position.
    //Upper j and here start is the end of the sub sorted array.
    static void pusher(int[] arr, int i, int current,int start){
        for(int m=start;m>i;m--){
            arr[m]=arr[m-1];
        }
        arr[i]=current;
    }
}


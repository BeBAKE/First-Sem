package DSA.Sorting;

import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr= {22,241,-34,2,0,234,35,57,54,86,2,75};
        int[] arr2 ={1,2,3,4,5,6,9,8};
        int[] arr3={5,7,6,1,2,3,4}; // example to understand swapped variable.
        bubbleSort(arr3);
        System.out.println(Arrays.toString(arr3));
    }
    static void bubbleSort(int[] arr){
        boolean swapped=false;

        for(int i = arr.length-2;i>0;i--){

            swapped=false;  //swapped is false , until it enters the if condition.
            // for example in arr3 after three iterations of i i.e at i=2
            // arr3 will be {1,2,3,4,5,6,7}, but still i will go to i=1 and i=0
            // for this to not happen swapped variable is used.
// for i = 2 program will not enter the inner for loop, so swapped variable will never be true, then break statement will follow.
            for(int j=0 ; j<=i ; j++){

                if(arr[j]>arr[j+1]){  // Once program enters the if condition that means for that value of i
                    int temp=arr[j];  // swap will take place.
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped) // If for any value of i swap does not occur then it means array has been sorted
                // so there is no further need to iterate the value of i.
                break;
        }

    }
}


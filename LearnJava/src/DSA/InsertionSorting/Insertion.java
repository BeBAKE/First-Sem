package DSA.InsertionSorting;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr={-343, -3, 43, 2, 4, 87, -43, 0, 6, 44 };
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int current=i+1;current>0;current--){
                if(arr[current]<arr[current-1]){
                    swap(arr,current,current-1);
                }else{
                    break; // Because if current is not less than current-1 ,there is no way current can be
                        // be smaller than any other in that sorted array. so no need to compare.
                }
            }
//            int pig=i;
//            for(int current=i+1;current>0;current--){
//                if(arr[current]<arr[pig]){
//                    swap(arr,current,pig);
//                    pig--;
//                }
//            }
        }
    }

    static void swap(int[] arr,int current,int i ){
        int temp=arr[current];
        arr[current]=arr[i];
        arr[i]=temp;
    }

}

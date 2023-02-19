package DSA.Recursion2;

import java.util.ArrayList;

/***
 * Finding all the accurance of the target element
 * using recursion
 * setting arraylist as the return type instead of making a static arraylist.
 */

public class LinearSearching2 {
    static ArrayList<Integer> searching(int[] arr , int target ,int index){
        ArrayList<Integer> list= new ArrayList<>();
        //Here index id 2
        //For example, this list is for index (say) 2
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }

        ArrayList<Integer> listFromBelowCalls = searching(arr,target,index+1);
        // Then listFromBelowCalls will be from index 3
        // Here index is still 2
        // ( Line 2 will only be executed when call is going above that is from touching
        // base condition at index 6 to 0 at the main function )

        list.addAll(listFromBelowCalls);

        return list;
    }

    public static void main(String[] args) {
        int[] arr= {4,2,-6,2,7,-1,3,3,-8,9,10,34,2,64};
//        int[] arr= {8,8};
        ArrayList ls = searching(arr, 2 , 0);
        System.out.println(ls);


    }
}

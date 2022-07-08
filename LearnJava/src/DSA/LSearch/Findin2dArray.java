package DSA.LSearch;

import java.util.Arrays;

public class Findin2dArray {
    public static void main(String[] args) {
        int[][] arr2d={
                {2,4,5},
                {33,2},
                {-6,34,8},
                {32,3,23,-333}
        };
        int target=23;

        System.out.println(Arrays.toString(Find(arr2d,target)));

    }
    static int[] Find(int[][] arr,int target){
        if(arr.length==0){
            return new int[]{-1,-1};
        }
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(target==arr[row][col]){
                    return new int[]{row,col};
                }
            }

        }
        return new int[]{-1,-1};
    }
}

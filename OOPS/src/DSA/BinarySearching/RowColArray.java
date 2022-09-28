package DSA.BinarySearching;

import java.util.Arrays;
// following array has both row and col sorted.
public class RowColArray {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30},
                {12,22,32},
                {14,24,34},
                {16,26,36}
        };
        int[][] arr2 = {
                {10,20,30,40},
                {12,22,32,42},
                {14,24,34,44},
                {16,26,36,46}
        };
        int[][] arr3 = {
                {10,20,30,40},
                {12,22,32,42},
                {14,24,34,44},
        };
        int[] ans=search(arr,39);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int target){
        int row=0,col=arr[0].length-1;
        while( col>=0 && row<=arr.length-1 ){
            if(arr[row][col]==target){
                return new int[]{row,col};
            }else if(arr[row][col]>target){
                col--;
            }else{
                row++;
            }
        }return new int[]{-1,-1};
    }
}

package DSA.BinarySearching;

//Array is sorted row wise only

import java.util.Arrays;

public class RowArray {
    public static void main(String[] args) {
        int[][] arr={
                {10,13,16,19},
                {22,25,27,30},
                {33,35,37,39},
                {42,44,46,49}
        };
        int[] ans=searchingColWise(arr,9);
        System.out.println(Arrays.toString(ans));
    }
    //
    static int[] searching(int[][] arr,int target){
        int colLen= arr[0].length;
        int start=0 , end = (arr.length*arr[0].length)-1 , mid ;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid/colLen][mid%colLen]<target)
                start=mid+1;
            else if(arr[mid/colLen][mid%colLen]>target)
                end=mid-1;
            else
                return new int[]{mid/colLen,mid%colLen};
        }
        return new int[]{-1,-1};
    }
    //
    static int[] searchingColWise(int[][] arr,int target){
        int row=0 , col = arr[0].length-1 , mid ,start =0,end=arr[0].length-1;
        while(row<arr[0].length){
            if(arr[row][col]>target){
                start=row;end=col;
                while(start<=end){
                    mid=start+(end-start)/2;
                    if(arr[row][mid]<target)
                        mid=start+1;
                    else if(arr[row][mid]>target)
                        end=mid-1;
                    else
                        return new int[]{row,mid};
                }
                return new int[]{-1,-1 };
            }
            else if(arr[row][col]<target)
                row++;
            else
                return new int[]{row,col};
        }
        return new int[]{-1,-1};
    }
}

package DSA.LSearch;

public class MinnoIn2dArray {
    public static void main(String[] args) {
        int[][] arr2d={
                {2,4,5},
                {33,2},
                {-6,34,8},
                {32,3,23,-333}
        };
//        System.out.println(arr2d[0][0]);
        System.out.println(Min(arr2d));
    }
    static int Min (int[][] arr){
        if(arr.length==0){
            return -1;
        }
        int min=arr[0][0];
        for(int[] row:arr){
            for(int col:row){
                if (col<min){
                    min=col;
                }
            }
        }
        return min;
    }
}

package DSA.Recursion;

public class MaxRecursion {
    public static void main(String[] args) {
        int[] arr={};

        System.out.println(findMaxRec(arr,0));
    }
    public static int findMaxRec(int[] arr,int n){
        if(n==arr.length-1){
            return arr[n];
        }
        return Math.max(arr[n],findMaxRec(arr,n+1));
    }
}

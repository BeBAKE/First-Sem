package DSA.Recursion2;

public class IncArray {
    //    static int index=0;
    static boolean isSorted(int[] arr){
        if(arr.length==0){
            return true;
        }
        return help(arr, 0);
    }
    private static boolean help(int[] arr, int index){

        if(index==arr.length-1){
            return true;
        }
        return arr[index]<=arr[index+1] && help(arr,++index);
    }

    public static void main(String[] args) {
        int[] arr = {};
        boolean ans=isSorted(arr);
        System.out.println(ans);
    }
}

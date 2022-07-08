package DSA.LSearch;

public class FindminNo {
    public static void main(String[] args) {
        int[] arr= {12,32,-6,-5,334,45,-32,2,2};
        System.out.println(Min(arr));
    }
    static int Min(int[] arr){
        int min=arr[0];
        for(int no:arr){
            if(no<min){
                min= no;
            }
        }
        return min;
    }
}

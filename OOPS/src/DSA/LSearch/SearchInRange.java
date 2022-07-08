package DSA.LSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr= {12,32,4,5,334,45,-32,2,2};

        int ans = search(arr,334,2,6);
        System.out.println(ans);
    }
    static int search(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for(int i = start;i<=end;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}

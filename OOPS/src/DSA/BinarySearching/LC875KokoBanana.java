package DSA.BinarySearching;

public class LC875KokoBanana {
    public static void main(String[] args) {
        int[] arr={805306368,805306368,805306368};
        int ans=minEatingSpeed(arr,1000000000);
        System.out.println(ans);
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int max=piles[0];
        for(int i : piles){
            if(max<i)
                max=i;
        }
        int start=1 ,end =max , mid;
        while(start<=end){
            mid=start+(end-start)/2;
            int sumChecker=sumChecker(piles,mid);
            if(sumChecker>h){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }return start;

    }
    public static int sumChecker(int[] piles , int mid){
        int sum=0;
        for(int i=0;i<piles.length;i++){
            sum+=piles[i]/mid;
            if(piles[i]%mid!=0)
                sum++;
        }
        return sum;
    }
}

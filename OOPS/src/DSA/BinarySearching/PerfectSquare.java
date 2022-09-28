package DSA.BinarySearching;

public class PerfectSquare {
    public static void main(String[] args) {
        boolean ans = isPerfectSquare(808201);
        System.out.println(ans);
    }
    public static boolean isPerfectSquare(int num) {
        long start=1 , end = num/2 ,mid;
        if(num==1)
            return true;
        while(start<=end){
            mid=start+(end-start)/2;
            long sq=mid*mid;
            if(sq<num)
                start=mid+1;
            else if(sq>num)
                end=mid-1;
            else
                return true;
        }
        return false;
    }
}


package DSA.Recursion;

public class SumDigits {
    public static void main(String[] args) {
        long ans= sumDigits(127);
        System.out.println(ans);
    }
    static long sumDigits(int num){
        if(num/10==0){
            return num;
        }
        return sumDigits(num/10)+(num%10);
    }

}



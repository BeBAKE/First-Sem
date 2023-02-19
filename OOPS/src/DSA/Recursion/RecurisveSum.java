package DSA.Recursion;

public class RecurisveSum {
    public static void main(String[] args) {
        int ans=Sum(80);
        System.out.println(ans);
    }
    static int Sum(int n){
        if(n<=0){
            return 0;
        }
        return n+Sum(n-1);
    }
}

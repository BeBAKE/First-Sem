public class WrongNumber {
    static StringBuilder ss;
    public static void main(String[] args) {
        int ans=fact(25);
        factorial(25);
        System.out.println(ans);
    }
    static void factorial(int n){
        int ans=1;
        while(n>0){
           ans=ans*(n);
           n--;
        }
        System.out.println(ans);
    }
   static int fact(int n){
        if(n==1){
            return n;
        }

        return fact(n-1)*n;
   }
}

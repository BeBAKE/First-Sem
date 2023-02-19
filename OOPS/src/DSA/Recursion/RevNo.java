package DSA.Recursion;

public class RevNo {
    static int x=0;

    //with a static (global) variable.
    static void reverse(int n){
        if(n==0){
            return ;
        }
        x=(x*10)+(n%10);
        reverse(n/10);
    }
    //with all local variables but have two arguments.
    static int reverse2(int n,int base){
        if(n==0){
            return base;
        }
        return reverse2(n/10,(base*10)+n%10);
    }

    static int reverse3(int n ){
        if(n/10==0){
            return n;
        }
        int digits=(int)Math.log10(n);
        return (n%10)*(int)Math.pow(10,digits) +reverse3(n/10);

    }
//    static int helper(int n ){
//        return (int)Math.log10(n);
//    }

    public static void main(String[] args) {
        reverse(86789);
        System.out.println(x);

        int ans2 = reverse2(1234,0);
        System.out.println(ans2);

        int ans3=reverse3(297492163);
        System.out.println(ans3);

    }





}

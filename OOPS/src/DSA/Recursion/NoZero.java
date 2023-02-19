package DSA.Recursion;

public class NoZero {
    static int count=0;

    static void zeroCount(int n){
        if(n==0){
            count++;
            return;
        }
        if(n/10==0){
            return ;
        }
        if(n%10==0){
            count++;
        }
        zeroCount(n/10);
    }

    static int zeroCount2(int n){
        if(n==0){
            return n;
        }
        return help(n,0);
    }

    private static int help(int n , int c){
        if(n/10==0){
            return c;
        }
        if(n%10==0){
            return help(n/10,++c);
        }else{
            return help(n/10,c);
        }
    }



    public static void main(String[] args) {
        zeroCount(0);
        System.out.println(count);
        int ans = zeroCount2(1000000);
        System.out.println(ans);

    }
}

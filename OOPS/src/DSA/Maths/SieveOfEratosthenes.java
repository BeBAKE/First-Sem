package DSA.Maths;
// Source -> https://www.geeksforgeeks.org/sieve-of-eratosthenes/
public class SieveOfEratosthenes {
    public static void main(String[] args){
        int n = 40;
        boolean[] prime = new boolean[n+1];
        sieve(n,prime);
    }

    //all false are marked prime and all the multiples of that false will be marked true
    // which is marked true.
    private static void sieve(int n, boolean[] prime) {
        //marking multiples false numbers true
        for(int i = 2 ; i*i<=n ; i++){
            if(!prime[i]){
                for(int j=i*i ; j <= n ; j+=i){
                    prime[j]=true;
                }
            }
        }
        //Printing all the true numbers
        for(int i = 2;i<=n;i++){
            if(!prime[i])
                System.out.print(i+" ");
        }

    }
}

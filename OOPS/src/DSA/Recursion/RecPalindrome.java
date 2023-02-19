package DSA.Recursion;
import DSA.Recursion.RevNo;

public class RecPalindrome {

    static boolean isPalin(int n ){
        return RevNo.reverse3(n)==n;
    }

    public static void main(String[] args) {
        System.out.println(isPalin(2342432));
    }
}

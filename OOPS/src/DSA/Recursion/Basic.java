package DSA.Recursion;

public class Basic {
    public static void main(String[] args) {
        numberCall(1);
    }

    public static void numberCall(int n) {
        if (n > 5) {
            return;
        }System.out.println(n);
        numberCall(n + 1);

    }
}
package DSA.Maths;

public class NewtonSqrt {
    public static void main(String[] args) {
        double ans = sqrt(490);
        System.out.println(ans);
    }
    static double sqrt(int n ){
        double x = n;
        double root=0;

        while(true){
            root= 0.5 * (x + (n/x) );

            if(Math.abs(x-root)<0.1){
                break;
            }
            x=root;
        }
        return root;
    }
}

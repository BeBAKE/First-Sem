package DSA.Recursion;

public class LC1324 {
    static int count=0;
    static int numberOfSteps(int n) {
        if(n==0){
            return count;
        }
        if(n%2==0){
            count++;
            return numberOfSteps(n/2);
        }else{
            count++;
            return numberOfSteps(n-1);
        }

    }

    public static void main(String[] args) {
        numberOfSteps(1);
        System.out.println(count);
    }

}

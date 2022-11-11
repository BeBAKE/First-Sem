public class EvenOdd {


    public static void main(String[] args) {
        int n = 59;
        if(isEven(n)) {
            System.out.println("number is even");
        }else{
            System.out.println("number is odd");
        }
    }
    private static boolean isEven(int n){
        return (n & 1)==0;
    }
}

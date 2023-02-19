package DSA.Maths;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        if(isEven(number)){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }

    }
    static boolean isEven(int n){
        return (n & 1)==0;
    }
}

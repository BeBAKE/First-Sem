package codeOptimization;
import java.util.Scanner;

// Using Math.log10(number)+1 will give us the number of digits number has


public class NoOfDigits {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        int noOfdigits= digits(num);
        System.out.println(noOfdigits);
    }
    static int digits(int num){
        if(num<0){
            num+=-1;
        }
        return (int)Math.log10(num)+1;

    }
}

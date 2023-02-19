package DSA.Recursion;

public class FirstUpperCase {
    public static void main(String[] args) {
        String name = "geeksogeekS";
        char ans=upperCase(name,0);
        System.out.println(ans);


    }
    static char upperCase(String str,int n){
        if(str.charAt(n)=='\0')
            return 0;
        if(Character.isUpperCase(str.charAt(n)))
            return str.charAt(n);
        else
            return upperCase(str,n+1);
    }
}

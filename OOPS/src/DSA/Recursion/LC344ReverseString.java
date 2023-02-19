package DSA.Recursion;

import java.util.Arrays;

public class LC344ReverseString {
    public static void main(String[] args) {
        String[] ch= {"H","a","n","n","a","h"};


//      reverseString(ch);



    }
    static void reverseString(String[] s) {
        int len=s.length;
        String[] newString =new String[len];
        reverse(s,newString,0,len);
        System.out.println(Arrays.toString(newString));

    }
    static void reverse(String[]s,String[] newChar,int n,int len) {
        if(n==len)
            return;
        reverse(s,newChar,n+1,len);
        newChar[len-1-n]=s[n];


    }
}

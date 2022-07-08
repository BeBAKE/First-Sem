package com.company.strings;

import java.util.Scanner;

public class Palingdrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(isPalindrome(str));

    }
    static boolean isPalindrome(String st){
        if (st.length()==0|| st==null){
            return false;
        }
        st=st.toUpperCase();
        int start=0;
        int end=st.length()-1;
        while(start<end){
            if(st.charAt(start)!=st.charAt(end)){
                return false;
            }
            start++;end--;
        }
        return true;
    }

}



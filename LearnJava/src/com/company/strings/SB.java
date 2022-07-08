package com.company.strings;


import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class SB {
    public static void main(String[] args) {
        StringBuilder stb = new StringBuilder();
        for (int i = 0 ;i<26;i++){
            char ch = (char)('a'+i);
            stb.append(ch);
        }
        System.out.println(stb.toString());
        System.out.println(stb.delete(2,10));
        System.out.println(stb);

        // Just playing with Strings
//
//        String str = "i am happy";
//        String st ="I AM HAPPY";
//        System.out.println(st.equals(str));
//        System.out.println("    this    is nothing".strip());
//        System.out.println(st.lines());
//        int[] he ={1,2,3,4,5};



    }
}

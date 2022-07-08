package com.company.strings;

public class Performance {
    // Very important for competitive programming
    // also asked in interviews
    public static void main(String[] args) {
        String series = "";
        for (int i= 0;i<26;i++){
            char ch= (char)('a'+i);
            series+=ch;
        }
        System.out.println(series);
    }
}

package com.company.Wow;

public  class Calc {
    public static void main(String[] args) {
        boolean go = true;
        int sc = 800;
        int round = 5;
        int bonus =200;
        int finalScore= calScore(go,sc,round,bonus);
        //System.out.println(finalScore);

    }
    public static int calScore(boolean go, int sc, int round ,int bonus){
        if (go){
            System.out.println(sc+round*bonus);
            return sc+round*bonus;
        }else {
            return -1;
        }


    }
}

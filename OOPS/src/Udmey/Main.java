package Udmey;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player p1 = new Player("Adam",40,100);
        Monster m1 = new Monster("David",30,90);

        System.out.println(p1.toString());
        System.out.println();
        System.out.println(m1.toString());
        System.out.println();
        System.out.println(p1.write());
        System.out.println();

        ArrayList<String> list = new ArrayList<>();
        for(int i =0;i<4;i++){
            list.add(i,sc.nextLine());
        }


        p1.read(list);
        System.out.println(p1.toString());
    }



}

package Project2;

import java.util.Scanner;

public class Gcam implements Camera{

    Scanner sc = new Scanner(System.in);

    @Override
    public void open(){
        System.out.println("Camera Opened");
    }

    @Override
    public void close(){
        System.out.println("camera closed");
    }

    @Override
    public void click(){
        System.out.println("CLiCk!!!");
    }
}

package Interfaces;

public class ElectricEngine implements Engine,Brake{

    public void start(){
        System.out.println("Electric Engine start");
    }
    public void stop(){
        System.out.println("Electric Engine stop");
    }
    public void acc(){
        System.out.println("Electric Engine accelerated");
    }
    public void brake(){
        System.out.println("Electric Brakes applied");
    }
}

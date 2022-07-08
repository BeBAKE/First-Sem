package Interfaces;

public class PowerEngine implements Engine,Brake{
    @Override
    public void start(){
        System.out.println("Power Engine start");
    }
    @Override
    public void stop(){
        System.out.println("Power Engine stop");
    }
    @Override
    public void acc(){
        System.out.println("Power Engine accelerated");
    }
    @Override
    public void brake(){
        System.out.println("Power Brakes appied");
    }
}

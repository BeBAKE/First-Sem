package Interfaces;

public class CdPlayer implements Media {

    @Override
     public void start(){
        System.out.println("Media Player has Started");
    }
    @Override
    public void stop(){
        System.out.println("Media Player has stopped");
    }
}

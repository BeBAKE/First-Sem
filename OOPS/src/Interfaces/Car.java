package Interfaces;

public class Car implements Brake,Engine,Media{
    @Override
    public void brake() {
        System.out.println("Brakes like a normal car");
    }

    @Override
    public void start() {
        System.out.println("Starts Engine like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("Stops Engine like a normal car");
    }

    @Override
    public void acc() {
        System.out.println("accelerates like a normal car");
    }

//    void allData(){
//        this.Brake();
//        this.start();
//        this.stop();
//        this.acc();
//    }
}

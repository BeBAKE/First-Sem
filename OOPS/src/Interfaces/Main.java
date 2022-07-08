package Interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.start();
//        car.stop();
//        car.acc();
//        car.brake();
//
////        Media carMedia = new Car();
////        carMedia.start();     this will give output as
////                          Starts Engine like a normal car
//        // in order to manipulate media we can make separate classes for the interfaces
//
//        CdPlayer carMedia = new CdPlayer();
//        carMedia.start();  // This will manipulate the media aspect of the car


        NiceCar car = new NiceCar();
        car.startMusic();
        car.start();
        car.engineUpgrade();
        car.start();
        car.brake();

        NiceCar tesla =new NiceCar();





    }
}

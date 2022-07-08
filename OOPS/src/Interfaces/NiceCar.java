package Interfaces;

public class NiceCar{
    private Engine engine;
    private Media player=new CdPlayer();
    private Brake brake;

    public NiceCar(){
        engine = new PowerEngine();
    }
    public NiceCar(Engine engine){
        this.engine = engine;
    }
    void engineUpgrade(){
        engine = new ElectricEngine();
    }

    void start(){
        this.engine.start();
    }
    void stop(){
        this.engine.stop();
    }

    void startMusic(){
        player.start();
    }

    void stopMusic(){
        player.stop();
    }
    void brake(){
        engine.stop();
    }


}

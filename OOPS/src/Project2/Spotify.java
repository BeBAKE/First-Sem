package Project2;

public class Spotify implements MusicPlayer{

    private boolean playing;

    @Override
    public void start(String song){
        playing=true;
        System.out.println(song+" is playing");
    }

    @Override
    public void stop(){
        playing=false;
        System.out.println("Music has stopped playing");
    }
}

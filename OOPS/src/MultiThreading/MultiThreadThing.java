package MultiThreading;

public class MultiThreadThing extends Thread{
    private int threadNumber;
    public MultiThreadThing(int threadNumber){
        this.threadNumber=threadNumber;
    }
    @Override
    public void run(){
        //Thread to print from 1 to 5
        for (int i = 1; i<=5;i++){
            System.out.println(i+" from thread no. "+threadNumber);
        }

    }


    public static void main(String[] args) {
        for(int i = 0; i<3;i++){
            MultiThreadThing myThing = new MultiThreadThing(i);
            myThing.start();
            System.out.println();
        }
    }

}

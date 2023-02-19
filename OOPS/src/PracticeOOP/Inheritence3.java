package PracticeOOP;
class Box{
    int l;
    int w;
    int h;


    void action(){
        System.out.println("Box is running");
    }

}

class BoxWeight extends Box{
    int weight;




    void action(){
        System.out.println("BoxWeight is waiting");
    }
    public void converter(){
        System.out.println("Box is converting into nothing");
    }

}

public class Inheritence3 {
    public static void main(String[] args) {
     Box b1= new Box();
        System.out.println(b1.h);

    }
}

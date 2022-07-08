package Polymorphism;

public class Tester3 {
    public static void main(String[] args) {
        Shapes shape=new Shapes();
        Circle circle =new Circle();
        Square square = new Square();
        Triangle triangle=new Triangle();
        Shapes c2 = new Square();

        c2.sh=98;   //In  case of overloading the object overloaded function will be called
                    // but in the case of field variables or member function it is the type of reference
                    // variable that decides which will be fetched

    }
}

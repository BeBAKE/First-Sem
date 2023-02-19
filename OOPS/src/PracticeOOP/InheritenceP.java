package PracticeOOP;

class Shape{
    public void area(){
        System.out.println("Displays area");
    }
}

class Triangle extends Shape {
    public void area(int l, int b){
        System.out.println(0.5*l*b);
    }
}

class EquilateralTriangle extends Triangle{
    public void area(int s){
        System.out.println(Math.sqrt(3)/2*s*s);
    }
}

public class InheritenceP {
    public static void main(String[] args) {
        Shape s1=new Shape();
        s1.area();

        Triangle t1= new Triangle();
        t1.area(5,6);

        EquilateralTriangle e1 = new EquilateralTriangle();
        e1.area(5);
    }
}

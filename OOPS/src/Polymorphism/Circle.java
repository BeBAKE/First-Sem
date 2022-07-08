package Polymorphism;



public class Circle extends Shapes {
    @Override//This is called annotation (It is basically used to check if the method is overriding)

    //This will run when the object of the class circle is created.
    //Hence, it is overriding the parent(shape) method
    void area(){
        System.out.println("Area of the circle is Pie * r * r ");
    }


  //  Note: When overriding a method, you should precede it with the @Override annotation.
    //  The parameter(s) and return type of an overridden method must
    //  be exactly the same as those of the method inherited from the supertype.


}

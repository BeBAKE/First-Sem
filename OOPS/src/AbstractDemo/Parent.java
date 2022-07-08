package AbstractDemo;

// Abstract - existing only as an idea, not a physical thing.
// If a class has at-least one abstract method , it is an abstract class
// We can't create object of an abstract class.

// We can't make abstract constructor .
// We can make a static method in abstract class

//Abstract classes tell what to do .
//Child classes of those abstract classes tell how to do.

//A non-abstract child must override each abstract method
// inherited from its parent by defining a method
// with the same signature and same return type.

public abstract class Parent {
    int age;

    public Parent(int age){
        this.age=age;
    }
    public static void hello(){
        System.out.println("hey");
    }

    abstract void career(String name);
    public abstract void partner(String name , int age);

}

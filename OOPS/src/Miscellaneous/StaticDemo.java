package Miscellaneous;/*
    .       Difference between static and non-static variable.
    .
    . Static variable is method variable and non static variables are object variables
    . counter and flag are two instance variables
    . flag is static , which means it is class variable
    . counter is non static , which means it is object variable
    . Both are put in the constructor ,which means they both will be incremented whenever an object is
           created
    . counter will always be 1 but flag will be incremented with every object creation because it is class variable and
        gets incremented every time an object of the class is created.
 */


public class StaticDemo {
    int counter=0;
    static int flag=0;
    public StaticDemo(){
        counter++;
        flag++;
    }

    public static void main(String[] args) {
        StaticDemo object1= new StaticDemo();
        StaticDemo object2 = new StaticDemo();

        System.out.println(object1.counter);
        System.out.println(object1.counter);
        System.out.println(StaticDemo.flag);
        System.out.println(object1.flag);
        System.out.println(object2.flag);
    }
}

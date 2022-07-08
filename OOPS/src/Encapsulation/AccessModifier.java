package Encapsulation;

public class AccessModifier {
    // "public" means "num" can be accessed anywhere( i.e "in same class" , "in another class in same package",
            //  "in sub-class in same package" , "in sub-class in another package",
            //  "in another class in another package" ).

    // "private" means "num" can be accessed just in this class.

    // " default " ( eg- int num ) means it can be accessed
            // ( in "same class" and "in another class of same package" ).

    // " protected " can be accessed same as public
            // but if case of different package it needs subclass to be accessed.
            // also, it needs object of that subclass to access "num".
            // ( because parent class does not know what subclass has

    protected int num;
    String name;
    int[] arr;

            // Getters and Setters come under Encapsulation

    // getter for private field/member variable num
    public int getNum() {
        return num;
    }

    // Setter for private field/member variable num
    public void setNum(int num) {
        this.num = num;
    }

    public AccessModifier(int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}

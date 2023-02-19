package PracticeOOP;

class A{

private void tell(){

}

}
class B extends A {

    void tell(){
        System.out.println("B is telling something");
    }
}


public class MultiLevelInheritence {
    public static void main(String[] args) {
        A obj = new B();
        B obj2 = new B();

       obj2.tell();
    }
}

package PracticeOOP;

public class Dog {
    final int maxAge=10;
    int legs=4;
    void move(){
        System.out.println(legs+" legged animal moves");
    }

    public static void main(String[] args) {
        Dog sheru = new Dog();
        Dog tommy = new Dog();

        System.out.println(sheru.maxAge);
        System.out.println(tommy.maxAge);
    }
}

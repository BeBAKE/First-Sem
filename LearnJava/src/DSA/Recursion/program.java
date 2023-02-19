package DSA.Recursion;

public class program {
    public static void main(String[] args) {
        message();
    }
    static void message(){
        System.out.println("Hello 1");
        message2();
    }

    private static void message2() {
        System.out.println("Hello 2");
        message3();
    }
    private static void message3(){
        System.out.println("hello 3");
        message4();
    }

    private static void message4(){
        System.out.println("hello 4");
        message5();
        System.out.println("hellllll");
    }

    private static void message5(){
        System.out.println("hello 5");
    }
}

package Introduction;

public class Human {

    String message = "Hello World";
    static{
        System.out.println("this is disguisting");
    }


    public static void display(Human human){
        System.out.println(human.message);
    }

   public static void main(String[] args){
        Human Vivek = new Human();
        Vivek.message="Vivek's message";

        Human.display(Vivek);
    }
}

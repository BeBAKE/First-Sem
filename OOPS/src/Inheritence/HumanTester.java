package Inheritence;

public class HumanTester {
    public static void main(String[] args){
        Father gaius = new Father();
        Child julius = new Child(2,2,1,122);

        System.out.println(julius.alive);
    }
}

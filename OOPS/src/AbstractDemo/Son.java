package AbstractDemo;

public class Son extends Parent{

    public Son(int age){
        super(age);
    }

    @Override
    public void career(String name){
        System.out.println("Father i want to be "+name);
    }
    @Override
    public void partner(String name, int age){
        System.out.format("I love "+name+"\nShe is %d years old",age);
        System.out.println();
    }

}

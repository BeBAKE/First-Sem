package AbstractDemo;

public class Daughter extends Parent{

    public Daughter(int age){
        super(age);
    }

    @Override
    void career(String name){
        System.out.println("Mother i want to be "+name);
    }

    @Override
    public void partner(String name, int age){
        System.out.format("I love "+name+"\nHe is %d years old",age);
        System.out.println();
    }

}

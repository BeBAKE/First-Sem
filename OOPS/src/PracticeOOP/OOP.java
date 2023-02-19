package PracticeOOP;

class Pen{
    private String brand;
    private String color;
    String type;
    private int price;

    public void write(String args){
        System.out.println(args.toUpperCase());
    }
//    //Setters
//    public void setBrand(String brand){
//       this.brand= brand;
//    }
//    public void setColor(String color){
//        this.color=color;
//    }
//    public void setType(String type){
//        this.type=type;
//    }
//    //Getters
//    public void getBrand(){
//        System.out.println(brand);
//    }
//    public void getColor(){
//        System.out.println(this.color);
//    }
//    public void getType(){
//        System.out.println(this.type);
//    }
    public Pen(String brand , String color , String type , int price){
        System.out.println("Constructor with parameters called");
        this.color=color;
        this.brand= brand;
        this.type= type;
        this.price= price;
    }

    public Pen(){
        System.out.println("constructor with no parameter called");
    }

    public Pen(String brand , String color, String type){
//        this(brand,color,type,10);
        System.out.println("constructor with one less parameter called");
        this.brand = brand;
        this.color= color;
        this.type=type;
    }
    //copy constructor
    public Pen(Pen p){
        System.out.println("copy constructor called");
        this.brand = p.brand ;
        this.type= p.type;
        this.color= p.color;
        this.price= p.price;
    }

    void getInfo(){
        System.out.println(this.price);
        System.out.println(this.brand);
        System.out.println(this.color);
        System.out.println(this.type);
    }

}

public class OOP {
    public static void main(String[] args) {
//        Pen p1 =new Pen();
//        p1.brand="Pilot";
//        Pen.color="blue";
//        p1.type="ball";
//
//        Pen p2 = new Pen();
//        p2.color="black";
//        System.out.println(p1.color+" "+p2.color);
//
//        p1.write("Your problem is your problem none of my problem");
        // Now using getters and setter member variables or instance variables can be accessed
        // in this case as these are now made private which is a feature of oops which is encapsulation.
//        Pen p1 = new Pen();
//        p1.setColor("black");
//        p1.setBrand("reynold");
//        p1.setType("ball");
//        p1.getColor();
//        p1.getBrand();
//        p1.getType();
//        System.out.println();
//        Pen p2= new Pen();
//        p1.setColor("blue");
//        p1.setBrand("pilot");
//        p1.setType("ball");
//        p1.getColor();
//        p1.getBrand();
//        p1.getType();
        Pen p5 = new Pen("reynold","blue","gel");
        p5.getInfo();
        System.out.println();
        Pen p6 = new Pen(p5);
        p6.getInfo();



    }
}

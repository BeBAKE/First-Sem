package Inheritence;

public class BoxPrice extends BoxWeight {
    double price;

    public BoxPrice() {
        super();
        this.price = -1;
    }

    public BoxPrice(double l, double b, double h, double weight, double price) {
        super(l, b, h, weight);
        this.price = price;
    }

    public BoxPrice(double side, double weight, double price) {
        super(side, weight);
        this.price = price;
    }
    public BoxPrice(BoxPrice other){
        super(other);
        this.price=other.price;
    }

    public void allData() {
        System.out.println("this is the data pertaining to the class BoxPrice");
        System.out.println("length =" + super.l);
        System.out.println("Breadth =" + super.b);
        System.out.println("height =" + this.h);
        System.out.println("weight =" + getWeight());
        System.out.println("price =" + this.price);

    }


}

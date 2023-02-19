package Inheritence;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
//        super();
        this.weight =-1;
    }

    public BoxWeight(double l,double b, double h,double w ){
        super( l ,  b,  h);//what is this? call the parents class constructor
                           // Used to initialize values in parent constructor
         // public Box(double l,double b,double h){
        //          this.l= l;
        //          this.b=b;
        //          this.h=h;
        //     }

        this.weight =w;
    }
    public double getWeight(){
        return this.weight;
    }

    public BoxWeight (double side,double weight){
        super(side);
        this.weight=weight;
    }
    public BoxWeight(BoxWeight other){ //Copy constructor
        super(other);
        this.weight =other.weight;
        System.out.println("It is in the BoxWeight class"+weight);
    }

    public void information(){
        super.information();
        System.out.println("this is the second one");
    }

//    public void allData(){
//        System.out.println("this is the data pertaining to the class BoxWeight");
//        System.out.println("length ="+this.l);
//        System.out.println("Breadth ="+this.b);
//        System.out.println("Breadth ="+this.h);
//        System.out.println("Breadth ="+this.weight);
//

//    }






    }

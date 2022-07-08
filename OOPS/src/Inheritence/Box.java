package Inheritence;

public  class Box {
     double l;
     double b;
     double h;

     // Constructor when object is initialized with no parameter
     public Box(){
         this.l=-1;
         this.b=-1;
         this.h=-1;
     }

     // Constructor when object is passed with 3 parameters
     public Box(double l,double b,double h){
          this.l= l;
          this.b=b;
          this.h=h;
     }

     //    CUBE
     public Box(double side){
          this.l=side;
          this.b=side;
          this.h=side;
          System.out.println("it is in the Box class");
     }


     // Passing parameter of type Box
     public Box(Box old){
          this.l= old.l;
          this.b=old.b;
          this.h=old.h;
          System.out.println("this is the box class");
     }

     //    }


     public void information(){
          System.out.println("Box is running");
     }

     public static void greeting(){
          System.out.println("Greetings from class Box");
     }



}

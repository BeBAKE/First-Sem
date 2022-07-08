package Inheritence;



public class Tester {
    public static void main(String[] args) {
//        Box box2 = new Box (1,1,7);
//
//        Box box1= new Box(b2);
//
//        System.out.println(b1.l+" "+b1.b+" "+b1.h);


                                             // REFERENCING PARENT OBJECT TO A CHILD
//        Box box3 = new BoxWeight(1,2,3,4);
//        System.out.println(box3.weight);     //  <-  this will give error(because the member variable weight is in the BoxWeight)
//        System.out.println(box3.l);          //  <- this will not give any error (because box does have variable l)
        // because it is the type of object
        // that determines what members can be accessed not the reference variable.


        //there are many variables in both parents and child classes.
        // you are given access to the variables that are in the ref types i.e BoxWeight.
        // Hence, you should have access to weight variable.
        // This also means, that the ones you are trying to access should be initialized.
        //but here, when object itself is of type parent class, how will you call the constructor of the child class.

//        BoxWeight box5 = new Box(2,3,4,5);
//        System.out.println(box5);

        Box.greeting();






            //
//
//        BoxWeight box4 = new BoxWeight(1,1,1,1);
//        System.out.println(box4.l+" "+box4.h+" "+box4.b+" "+box4.weight);
//        BoxWeight box6 = new BoxWeight(box4);
//
//

    }
}

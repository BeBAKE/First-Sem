package com.company;

class Emp { // HERE it is not the name of the file because it is not set to public.
    static String ceo;
    int eid;
    int salary;
    int age;

//    public void show(){
//        System.out.println(this.eid+" :  "+this.salary+" : "+this.ceo+" : "+this.isRetired(this.age));
//    }
    public void show(){
        System.out.format(" %d : %,d : %s : %b \n",this.eid,this.salary,this.ceo,this.isRetired(this.age));
    }

    private boolean isRetired(int age){
        return age>60;
   }

}

public class StaticDemo {
    public static void main(String[] args) {
        Emp vivek = new Emp();
        vivek.eid = 9933;
        vivek.salary = 1500000;
        Emp.ceo ="Rutherford";

        Emp sam = new Emp();
        sam.eid= 2222;
        sam.salary= 130000;
        Emp.ceo = "jj";

        Emp harry = new Emp();
        harry.eid=2323;
        harry.salary=120000;

        Emp.ceo="Vivek"; // As we made ceo static we don't need oblject
        // We can still use object name ,but it won't make a difference
        // As "static" keyword has made ceo's value same throughout,
        // so only the last change in its value will show for all


        vivek.show();
        sam.show();
//        System.out.println(Emp.ceo);
//        System.out.println(Emp.Death(76));

        harry.show();


    }


}


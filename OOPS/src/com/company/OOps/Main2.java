package com.company.OOps;

public class Main2 {
    public static void main(String[] args) {
//        VipCustomers person1 = new VipCustomers();
//        System.out.println(person1.getName());
//
//        VipCustomers person2 =new VipCustomers("Bob",99);
//        System.out.println(person2.getName());
//
//        VipCustomers person3 = new VipCustomers("tom",88,"tim@gmail.com");
//        System.out.println(person3.getName());

//        Circle c1= new Circle(3);
//        System.out.println(c1.getRadius());
//        System.out.println(c1.getArea());
//
//        Cylinder c2= new Cylinder(4,3);
        Circle circle = new Circle (3.75) ;
        System.out.println("circle.radius="+ circle.getRadius());
        System.out.println("circle.area="+circle.getArea());
        Cylinder cylinder = new Cylinder (5.55, 7.25) ;
        System.out.println("cylinder.radius= "+ cylinder.getRadius());
        System.out.println("cylinder.height= "+ cylinder.getHeight());
        System.out.println("cylinder.area= "+ cylinder.getArea());

        System.out.println("cylinder. volume="+cylinder.getVolume());
    }
}

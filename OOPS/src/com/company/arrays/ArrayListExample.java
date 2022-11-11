package com.company.arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {

        // ArrayList is a dynamic array for which we do not have to specify the size.
        // Though arraylist are slower than the standard arrays, but they are helpful where we have to modify a lot
           // of arrays.

        /*
              SYNTAX -
                        ArrayList<datatype(wrapper classes)> var_name = new ArrayList<>(total number of elements to add);

                       ( where, ArrayList is a class )

              Following are some useful thing for arrayList ->

              list.get(index) = gives indexed value of list , (it's same as a[index] ).
              list.set(index,value) = puts that value at that index ,(same as a[index] = value).
              list.add(value) = adds value to the list with continuous index
                 first it puts at 0th index , then 1st ,then 2nd .......

         */

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(8); // if this user entered capacity is exceeded ,lets say
                       // I enter more than 8 elements , Internally it has the function to extend the capacity of this
                      // ArrayList .

        //      Inputting values     //

//        list.add(75);
//        list.add(37);
//        list.add(38);
//        list.add(849);
//        list.add(25);
//        list.add(90);
//        list.add(14);
//        list.add(20);

             // or
        for (int i = 0; i< 8 ; i++){
            list.add(sc.nextInt());
        }

        //   Get item at any index  //

        for (int i = 0; i < list.size() ; i++){
            System.out.println(list.get(i)); // list[index] will not work here.
        }


        System.out.println(list.contains(90)); // list.contains(number) gives boolean value

        System.out.println(list); // this prints list in [ , , ... , ] format because class ArrayList has
                                             //toString

        list.set(0,33737); // modifies value at 0th index to 33737

        System.out.println(list);
        System.out.println(list.get(3)); // list.get(index) is like a[index]

    }
}

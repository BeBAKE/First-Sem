import Project2.Phone;

import java.util.ArrayList;

public class GenericExample {
    public static void main(String[] args) {
//        Printer<Integer> printer = new Printer<>(23);
//        printer.Print();
//
//        Printer<String> name = new Printer<>("Death is my reward");
//        name.Print();
//
//        ArrayList<Phone> phones = new ArrayList<>();
//        phones.add(new Phone());
//        Phone p1 = new Phone();
//        System.out.println(phones.get(0));

        shout("death",345.3435345);
    }
    public static <dumbshit, othershit> void shout(dumbshit anything,othershit something){
        System.out.print(anything+" ");
        System.out.println(something+"!!!!!");
    }
}

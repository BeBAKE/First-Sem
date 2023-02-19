package PracticeOOP;
/** When password is set to static( for static password for all objects was same but for non-
 * static it will be different for different objects) and
 *  all member variables and function of PasswordGenerator are non-static (importing was simple
 *  in this case,it was just like using Random function).
 *
 *  import Maths.Random;
 *  Random rand = new Random(int upperbound);
 *  System.out.println(rand);
 *  or
 *  System.out.println(new Random(int upperbound));
 *
 *
 */
//import passwordGenerator.PasswordGenerator;
//public class Del2 {
//
//    static private String password;
//    void setPassword(String pass){
//        this.password= pass;
//    }
//    String getPassword(){
//        return this.password;
//    }
//
//    public static void main(String[] args) {
//        Del2 obj1 = new Del2();
//        Del2 obj2 = new Del2();
//
//        PasswordGenerator haha= new PasswordGenerator();
//
//        obj1.setPassword(haha.generate());
//        System.out.println(obj1.getPassword()); //HMc)!nL6jqdy<>M&
//
//        obj2.setPassword(haha.generate());
//        System.out.println(obj2.getPassword());  //@^o(mv3(ic1[F]qC
//        System.out.println(obj1.getPassword());  //@^o(mv3(ic1[F]qC
//    }
//}
import passwordGenerator.PasswordGenerator;
public class Del2 {

    static private String password;
    void setPassword(String pass){
        this.password= pass;
    }
    String getPassword(){
        return this.password;
    }

    public static void main(String[] args) {
        Del2 obj1 = new Del2();
        Del2 obj2 = new Del2();

        PasswordGenerator haha= new PasswordGenerator();

        obj1.setPassword(haha.generate());
        System.out.println(obj1.getPassword());

        obj2.setPassword(haha.generate());
        System.out.println(obj2.getPassword());
        System.out.println(obj1.getPassword());
    }



}


package PracticeOOP;

import com.company.OOps.Calculator;
import com.company.OOps.Carpet;
import com.company.OOps.Floor;


public class Main {
    public static void main(String[] args) {
        Floor f1= new Floor(20,10);
        Carpet e1 = new Carpet(20);
        Calculator c1 = new Calculator(f1,e1);
        double value=c1.getTotalCost();
        System.out.println(value);
    }
}

package Introduction;

// num in AccessModifier class is protected.
// so to access it in other package we need object of the subclass.
// to access it

// Why? --------

import Encapsulation.AccessModifier;

public class Third extends AccessModifier {
    public Third(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {

// AccessModifier a = new AccessModifier(34,"Loki");
//
// System.out.println(a.num);

        Third a = new Third(34,"Loki");

        System.out.println(a.num);
    }
}

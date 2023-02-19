package passwordGenerator;

import java.util.Random;

public class PasswordGenerator {
    private StringBuilder pass; // Only declaration of pass has done here ,currently it is not referencing to anything
        // so if it is dereferenced ( used . or [] ) in any function ,it will give null pointer exception error.
    // But it will not do this in this code because it is initialized/referenced at line 14
    // Note-> pass has to be initialized in every function unlike rr (which has already been initialized at line 10)
    private Random rr= new Random();// rr has been declared and initialized
    private String str;
    int limit = 14;

    public String generate() {
        pass=new StringBuilder();
        str = "abcdefghijklmnopqrstuvwxyz" + "0123456789" +
                "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "!@#$%^&*()_-+={}[]|><";
        for (int i = 0; i < 16; i++) {
            pass.append(str.charAt(rr.nextInt(83)));
        }
        return String.valueOf(pass) ;
    }

}




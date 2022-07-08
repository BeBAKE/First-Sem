import java.util.Arrays;

public class Printf <T> {
    public static <T> void printf(T... anyDatatype){
        for(T traverser:anyDatatype){
            System.out.println(traverser);
        }
    }
    protected static void some(int... variable){
        for(int i : variable){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
//        printf("this is not worth it",3434,232423.324);
        some(32,34);

    }

}

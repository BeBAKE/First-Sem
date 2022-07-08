package Introduction;

public class Numbers {
    double sum(double a,int b){
        System.out.println("Double");
        return a+b;
    }
    double sum(int a,int b,int c){
        System.out.println("Int");
        return a+b;
    }

    public static void main(String[] args){
        Numbers obj=new Numbers();

        obj.sum( 2.76,5);
    }
}

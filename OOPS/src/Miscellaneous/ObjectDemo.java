package Miscellaneous;

public class ObjectDemo{
    int num ;

    public ObjectDemo(int num){
        this.num = num;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num; // ((Miscellaneous.ObjectDemo)obj). is used because equals accepts parameter of
                                // type Object .
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(23);
        ObjectDemo obj2 = new ObjectDemo(78);
        System.out.println(obj1==obj2);
        System.out.println(obj1.equals(obj2));

    }




}

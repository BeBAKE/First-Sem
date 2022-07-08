// <T> -- Type Parameter
//<We can write whatever we want>  but we write <T> because its the conven
// convention

public class Printer <T>{

    T thingtoPrint;

    public Printer(T anyDatatype){
        this.thingtoPrint=anyDatatype;
    }

    public void Print(){
        System.out.println(thingtoPrint);
    }

}

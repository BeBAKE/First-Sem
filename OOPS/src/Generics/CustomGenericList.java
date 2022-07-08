/*
    .
    .
    . Type parameter 'T' cannot be instantiated directly. So we made it of Object type
    . Line 58
    .
 */



package Generics;

import java.util.Arrays;
import java.util.Scanner;

public class CustomGenericList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE=10;
    private int sizee = 0; //also works as

    public CustomGenericList(){
        this.data= new Object[DEFAULT_SIZE];
    }

    public void add(T element){
        if(isFull()){
            resize  ();
        }
        data[sizee++]=element;
    }

    private boolean isFull(){
        return this.data.length==sizee;
    }

    private void resize(){
        Object[] temp =new Object[sizee*2];

        // Putting values of data in temp .
        for(int i=0;i<data.length;i++){
            temp[i]=this.data[i];
        }
        // giving values back to data.
        this.data=temp;
    }


    public static void print(CustomGenericList something) {
        System.out.println( "CustomArrayList { " +
                "data = " + Arrays.toString(something.data) +
                ", sizee=" + something.sizee +
                '}');
    }

    public void set(T value , int index){
        this.data[index]=value;
    }

    public T get(int index){
        return (T)this.data[index]; // Here we did (T) because this.data is of Object . So converting Object to T.
    }

    public T remove(){
        T removed = (T)(this.data[--sizee]);
        return removed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CustomGenericList sum = new CustomGenericList<>();
        for(int i=1;i<=10;i++){
            sum.add(sc.next());
        }
        print(sum);

        CustomGenericList<Integer> list = new CustomGenericList<Integer>();
        for(int i=1;i<=10;i++){
            sum.add(sc.nextLine());
        }
        print(list);






    }
}

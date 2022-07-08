package Generics;

import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE=10;
    private int sizee = 0; //also works as

    public CustomArrayList(){
        this.data= new int[DEFAULT_SIZE];
    }

    public void add(int element){
        if(isFull()){
            resize  ();
        }
        data[sizee++]=element;
    }

    private boolean isFull(){
        return this.data.length==sizee;
    }

    private void resize(){
        int[] temp =new int[sizee*2];

        // Putting values of data in temp .
        for(int i=0;i<data.length;i++){
            temp[i]=this.data[i];
        }
        // giving values back to data.
        this.data=temp;
    }


    public static void print(CustomArrayList something) {
        System.out.println( "CustomArrayList{" +
                "data=" + Arrays.toString(something.data) +
                ", sizee=" + something.sizee +
                '}');
    }

    public void set(int value , int index){
        this.data[index]=value;
    }

    public int get(int index){
        return this.data[index];
    }

    public int remove(){
        int removed = data[--sizee];
        return removed;
    }


    public static void main(String[] args) {

        CustomArrayList sum = new CustomArrayList();
        for(int i=1;i<=21;i++){
            sum.add(i);
        }





    }
}

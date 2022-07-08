package Inheritence;

public class Child extends Father{
    int toys;
    int playtime;

    public Child(){
        super();
        this.toys=0;
        this.playtime=0;
    }
    public Child(int arms,int legs,int head,int toys){
        super(arms,legs,head);
        this.toys=toys;
        this.playtime= playtime;
    }


}

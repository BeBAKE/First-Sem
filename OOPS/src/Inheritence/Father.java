package Inheritence;

public class Father {
    int arms;
    int legs;
    int head;
    boolean alive;

    public Father(){
        this.arms=0;
        this.legs=0;
        this.head=0;
        this.isAlive(false);
    }

    public Father(int ar,int le,int head){
        this.arms=ar;
        this.legs=le;
        this.head=head;
        this.isAlive(true);

    }
    private boolean isAlive(boolean bh){
        this.alive=bh;
        return bh;
    }
    public boolean money(boolean doesHeMakeMoney){
        return doesHeMakeMoney;
    }

}

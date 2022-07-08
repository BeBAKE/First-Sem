package Udmey;

import java.util.ArrayList;

public class Player implements ISavable {
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength){
        this.name =name;
        this.hitPoints=hitPoints;
        this.strength= strength;
        this.weapon = "Sword";
    }

            // Getters
    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

            // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public ArrayList<String> write(){
        ArrayList<String> list =new ArrayList<String>();
        list.add(0,this.name);
        list.add(1,""+this.hitPoints);
        list.add(2,""+this.strength);
        list.add(3,this.weapon);

        return list;
    }
    @Override
    public void read(ArrayList<String> str){
        if(str!=null && str.size()>0){
            this.name=str.get(0);
            this.hitPoints= Integer.parseInt(str.get(1));
            this.strength= Integer.parseInt(str.get(2));
            this.weapon=str.get(3);
        }
    }
    @Override
    public String toString(){
        String value="Player{" +
                "name="+this.name+
                ", hitPoints="+this.hitPoints+
                ", strength="+this.strength+
                ", weapon="+this.weapon+"}";
        return value;

    }
}


                //&&&&&&&&&&&&&&&&&&&&&&&&&&
                //XxxXXXX&&&&&&&&&&&&&&&&&&
                //&&&&&&&&&&&&&&&&&&&&&&&&&


class Monster implements ISavable {
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength){
        this.name =name;
        this.hitPoints=hitPoints;
        this.strength= strength;
    }

    /*
     .
     .
     .*   Getters
     .
     .
     */
    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }



    @Override
    public ArrayList<String> write(){
        ArrayList<String> list =new ArrayList<String>();
        list.add(0,this.name);
        list.add(1,""+this.hitPoints);
        list.add(2,""+this.strength);

        return list;
    }
    @Override
    public void read(ArrayList<String> str){
        if(str!=null && str.size()>0){
            this.name=str.get(0);
            this.hitPoints= Integer.parseInt(str.get(1));
            this.strength= Integer.parseInt(str.get(2));
        }
    }
    @Override
    public String toString(){
        String value="Monster{" +
                "name="+this.name+
                ", hitPoints="+this.hitPoints+
                ", strength="+this.strength+
                "}";
        return value;

    }
}






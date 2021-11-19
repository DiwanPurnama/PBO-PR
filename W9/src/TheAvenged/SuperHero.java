/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheAvenged;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Windows 10
 */
public abstract class SuperHero implements Comparable<SuperHero>{
    private int powerLevel;
    private String name;
    private ArrayList<Power> powerList = new ArrayList();

    //Constructor
    public SuperHero(String name, int powerLevel) {
        this.name = name;
        this.powerLevel = powerLevel;
    }

    //getter powerLevel
    public int getPowerLevel(){
        return this.powerLevel;
    }

    //getter name
    public String getName(){
        return this.name;
    }

    //adding power to the list
    public void addPower(Power power){
        this.powerList.add(power);
    }

    //to be overriden
    public void identity(){}

    //menunjukkan kekuatan SuperHero
    public void showPowers() {
        System.out.println(".....HEED ME.....");
        System.out.println("FOR MY NAAAAAAAME IS " + getName().toUpperCase());
        System.out.println("TIME TO SHOW YOU MY POWERS");
        for(Power i : powerList){
            i.doPower();
        }
    }
    
    public int compareTo(SuperHero o) {
        if (this.powerLevel < o.getPowerLevel()) {
            return -1;
        } else {
            return this.powerLevel > this.getPowerLevel() ? 1 : 0;
        }
    }
}

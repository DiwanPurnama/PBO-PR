/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasTeori;
import java.util.*;

/**
 *
 * @author Windows 10
 */
public class Niece implements Comparable<Niece> {
    private String name;
    private int birthDay;
    private int birthMonth;
    Map<Uncle, String> presents =  new HashMap<Uncle, String>();
    
    public void setName(String name){
        this.name=name;
    }
    
    public void setBirthDay(int birthDay){
        this.birthDay= birthDay;
    }
    
    public void setBirthMonth(int birthMonth){
        this.birthMonth=birthMonth;
    }
    
    public String getName(){
        return name;
    }
    
    public int getBirthDay(){
        return birthDay;
    }
    
    public int getBirthMonth(){
        return birthMonth;
    }
    
    public Map<Uncle, String> getPresents(){
        return this.presents;
    }
    
    public int clearPrensents(){
        int totalPresent =0;
        for(String present : presents.values()){
            if(present != null) totalPresent++;
        }
        presents.clear();
        return totalPresent;
    }
    
    public void listPresents(){
        System.out.println("========================================");
        System.out.println("List of presents for "+this.name +":");
        for(Map.Entry<Uncle, String> entry : presents.entrySet()){
            System.out.print("- ");
            System.out.print(entry.getKey().getName());
            System.out.println((entry.getValue()==null ? "has't given present" :" give "+ entry.getValue()));
        }
    }
    
    @Override
    public String toString(){
        return "Name: "+name + " |Birth Day "+birthDay+ "-"+ birthMonth;
    }
    
    @Override
    public boolean equals(Object other){
        if(other == this) return true;
        if(other == null)return false;
        if(getClass() != other.getClass()) return false;
        return name.equals(((Niece)other).name);
    }
    @Override
    public int hashCode(){
        return name.hashCode();
    }
    
    @Override
    public  int compareTo(Niece other){
        if(this.birthMonth > other.birthMonth) return 1;
        if(this.birthMonth == other.birthMonth){
            return (this.birthDay > other.birthDay ? 1:-1);
        }
        return -1;
    }
    
}

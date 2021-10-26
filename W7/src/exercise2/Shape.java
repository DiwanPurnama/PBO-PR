/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

/**
 *
 * @author Diwanp
 */
public class Shape {
    //private atribut
    private String color;
    private boolean filled;
    
    //default constructor
    public Shape(){
        color="green";
        filled=true;
    }
    
    //constructor with given color, filled
    public Shape(String c, boolean f){
        color=c;
        filled=f;
    }
    
    //return the color
    public String getColor(){
        return color;
    }
    
    //set color
    public void setColor(String color){
        this.color=color;
    }
    
    //return the filled
    public boolean isFilled(){
        return filled;
    }
    //set filled
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    
    public String toString(){
        if(isFilled()){
            return "A shape with color of "+ color + " is filled";
        }else{
            return "A shape with color of "+ color + " isn't filled";
        }
    }
}

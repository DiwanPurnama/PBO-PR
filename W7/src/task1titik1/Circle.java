/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1titik1;

/**
 *
 * @author Windows 10
 */
public class Circle {
    private double radius;
    private String color;
    
    //Contructors(overloaded)
    public Circle(){//default constructor
        radius=1.0;
        color="red";
    }
     //2nd Constructor
    public Circle(double r){
        radius=r;
        color="red";
    }
    
    //3rd constructor
    public Circle(double r, String c){
        radius=r;
        color=c;
    }
    
    //return the radius
    public double getRadius(){
        return radius;
    }
    
    //return the area of this circle instance
    public double getArea(){
        return radius*radius*Math.PI;
    }
    
    public String toString(){
        return "Circle[radius="+ radius + "color="+ color +"]";
    }
    
    //return the color
    public String getColor(){
        return color;
    }
    
    //method setter color
    public void setColor(String color){
        this.color=color;
    }
}

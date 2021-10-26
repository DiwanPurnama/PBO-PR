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
public class Cylinder extends Circle {
    private double height;//private variable
    
    //Constructor with defalut color, radius and height
    public Cylinder(){
        super();
        height=1.0;
    }
    
    //Constructor with default color,radus but given height
    public Cylinder(double height){
        super();
        this.height=height;
    }
    
    //Constructor with default color, but given radius, height
    public Cylinder(double radius, double height){
        super(radius); //call superClass constructor circle
        this.height=height;
    }
    
    //return the height
    public double getHeight(){
        return height;
    }
    
    //A public method for computing the volume of cylinder
    //use superclass method getArea() to get the base area
    public double getVolume(){
        return super.getArea()*height;
    }
    
    @Override
    public double getArea(){
        return 2*Math.PI*getRadius()*getHeight()+2*super.getArea();
    }
    
    @Override
    public String toString(){//in Cylinder class
        return "Cylinder : subclass of "+ super.toString() + " height"+ height;//use Circle toString()
    }
}

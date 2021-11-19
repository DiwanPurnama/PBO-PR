/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaintingShapes;

/**
 *
 * @author Windows 10
 */
public class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(double tinggi,double lebar){
        super("Rectangle");
        length=tinggi;
        width=lebar;
    }
    
    @Override
    public double area(){
        return length * width;
    }
    
    public String toString(){
        return super.toString() + "of length "+ length+ " and width "+width;
    }
}

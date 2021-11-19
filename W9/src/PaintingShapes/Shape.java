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
public abstract class Shape {
    String shapeName;
    public Shape(String shapeName){
        this.shapeName=shapeName;
    }
    
    public abstract double area();
    
    public String toString(){
        return "Shape Name : "+ shapeName;
    }
}

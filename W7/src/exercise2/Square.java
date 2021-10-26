/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

/**
 *
 * @author Windows 10
 */
public class Square extends Rectangle {
    
    public Square(){
        super();
    }
    
    public Square(double side){
        super(side, side);
    }
    
    public Square(double side, String c, boolean f){
        super(side,side,c,f);
    }
    
    public double getSide(){
        return super.getWidth();
    }
    
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }
    
    @Override
    public void setWidth(double side){
        super.setWidth(side);
    }
    
    @Override
    public void setLength(double side){
        super.setLength(side);
    }
    
    
    
    @Override
    public String toString(){
        return "A Square with side= " + getSide() + ", which is a subclass of " + super.toString();
    }
}

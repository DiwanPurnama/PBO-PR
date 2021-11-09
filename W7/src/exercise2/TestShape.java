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
public class TestShape {
    public static void main(String[] args) {
        Shape s1 =new Shape();
        System.out.println(s1.toString());
        
        Shape s2 = new Shape("blue", true);
        System.out.println(s2.toString());
        
        s2.setFilled(false);
        s2.setColor("red");
        System.out.println(s2.toString());
        
        Circle c1= new Circle();
        System.out.println(c1.toString());
        System.out.println("Luas = " + c1.getArea());
        System.out.println("Keliling = "+ c1.getPerimeter());
        
        Circle c2= new Circle(7.0);
        System.out.println(c2.toString());
        System.out.println("Luas = " + c2.getArea());
        System.out.println("Keliling = "+ c2.getPerimeter());
        
        Circle c3= new Circle(7.0, "blue", true);
        System.out.println(c3.toString());
        
        Rectangle r1 = new Rectangle();
        System.out.println(r1.toString());
        System.out.println("has luas = "+ r1.getArea() + " Keliling = "+ r1.getPerimeter());
        
        Rectangle r2 = new Rectangle(10.0, 5.0);
        System.out.println(r2.toString());
        System.out.println("has luas = "+ r2.getArea() + " Keliling = "+ r2.getPerimeter());
        
        Rectangle r3 = new Rectangle(10.0, 5.0, "black", true);
        System.out.println(r3.toString());
        System.out.println("has luas = "+ r3.getArea() + " Keliling = "+ r3.getPerimeter());
        
        Square sq1=new Square();
        System.out.println(sq1.toString());
        System.out.println("has luas = "+ sq1.getArea() + " Keliling = "+ sq1.getPerimeter());
        
        
        
    }
}

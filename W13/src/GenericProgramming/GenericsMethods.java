/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GenericProgramming;

/**
 *
 * @author Windows 10
 */
public class GenericsMethods {
    //Java Generic Method
    public  static <T> boolean isEqual(GenericsType<T> g1, GenericsType<T> g2){
        return g1.get().equals(g2.get());
    }
    
    public static void main(String[] args) {
        GenericsType<String> g1 = new GenericsType<>();
        g1.set("Java");
        
        GenericsType<String> g2 = new GenericsType<>();
        g2.set("Java");
        
        boolean isEqual = GenericsMethods.<String>isEqual(g1,g2);
        //above statement can be written simply as
        isEqual = GenericsMethods.isEqual(g1,g2);
        /*This feature, known as type interface ,allows you to invoke a generic method as an
        ordinary method, without specifying a type beetwen angle brackets
        */
        
        //compiler will infer the type that is needed 
    }
}

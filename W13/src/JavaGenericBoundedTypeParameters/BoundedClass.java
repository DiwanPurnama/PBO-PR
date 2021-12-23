/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaGenericBoundedTypeParameters;

/**
 *
 * @author Windows 10
 */
public class BoundedClass {
    public static void main(String a[]){
        //Creating object of sub class  C and
        //passing it to Bound as a type parameter
        Bound<C> bec = new Bound<C>(new C());
        bec.doRunTest();
        
        //Creating object of sub class  B and
        //passing it to Bound as a type parameter
        Bound<B> beb = new Bound<B>(new B());
        beb.doRunTest();
        
        //similarly passing super class A
        Bound<A> bea = new Bound<A>(new A());
        bea.doRunTest();
    }
}

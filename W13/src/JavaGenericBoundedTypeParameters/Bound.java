/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaGenericBoundedTypeParameters;

/**
 *
 * @author Windows 10
 */
class Bound<T extends A> {
    private T objRef;
    
    public Bound(T obj){
        this.objRef=obj;
    }
    
    public void doRunTest(){
        this.objRef.displayClass();
    }
}

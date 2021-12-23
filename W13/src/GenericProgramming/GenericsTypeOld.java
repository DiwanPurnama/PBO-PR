/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GenericProgramming;

/**
 *
 * @author Windows 10
 */
public class GenericsTypeOld {
    private Object t;
    
    public Object get(){
        return t;
    }
    
    public void set(Object t){
        this.t=t;
    }
    
    public static void main(String[] args) {
        GenericsTypeOld type = new GenericsTypeOld();
        type.set("Java");
        String str = (String) type.get();
        System.out.println(" Hasil output : "+ str);
        //type casting, error prone and cause ClassCastException
    }
}

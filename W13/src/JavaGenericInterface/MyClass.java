/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaGenericInterface;

/**
 *
 * @author Windows 10
 */
class MyClass<T extends Comparable<T>> implements MinMax<T> {
    T[] vals;
    MyClass(T[] o){
        vals = o;
    }
    
    public T max(){
        T v = vals[0];
        for(int i=1; i<vals.length;i++){
            if(vals[i].compareTo(v)>0){
                v = vals[i];
            }
        }
        return v;
    }
}

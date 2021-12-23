/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GenericBounded;

/**
 *
 * @author Windows 10
 */
public class GenericBound<T> {

    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public <U extends Number> void inspect(U u) {
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    public static void main(String[] args) {
        GenericBound<Integer> IntegerBound = new GenericBound<Integer>();
        IntegerBound.add(new Integer(10));
        IntegerBound.inspect(20);
    }
}

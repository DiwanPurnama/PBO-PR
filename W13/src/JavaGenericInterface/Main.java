/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaGenericInterface;

/**
 *
 * @author Windows 10
 */
public class Main {
    public static void main(String[] args) {
        Integer inums[] = {3, 6, 2, 8, 6};
        Character chs[] = {'b', 'r', 'p', 'w'};
        MyClass<Integer> a = new MyClass<Integer>(inums);
        MyClass<Character> b = new MyClass<Character>(chs);
        System.out.println(a.max());
        System.out.println(b.max());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contGenericClassNMethod;

/**
 *
 * @author Windows 10
 */
public class ListDriver {

    public static void main(String[] args) {
        List<String> glist = new List<String>(10);
        glist.add("milk");
        glist.add("eggs");
        System.out.println("Grocery list: " + glist.toString());

        List<Integer> numbers = new List<Integer>(5);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Numbers: " + numbers.toString());
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

/**
 *
 * @author Windows 10
 */
public class Address {
    private final String name;
    private final Town town;

    public Address(String name, Town town) {
        this.name = name;
        this.town = town;
    }

    public String getName(){
        return name;
    }
    

    public Town getTown() {
        return town;
    }

    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", town=" + town +
                '}';
    }

    
}

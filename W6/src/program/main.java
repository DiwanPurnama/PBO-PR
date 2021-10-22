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
public class main {
    public static void main(String[] args) {
        Continent cont1 = new Continent("Europe", 1000);
        Country count1 = new Country("Great Britain", cont1, 200);
        Town t1 = new Town("London", count1, 100);
        Address ad1 =  new Address("Oxford Street", t1);
        Address ad2 =  new Address("Regent Street", t1);
        Address ad3 =  new Address("Park Street", t1);
        Company comp1 = new Company("Aston Martin", 1000.0);
        Company comp2 = new Company("Jaguar", 2000.0);
        Company comp3 = new Company("Bentley", 3000.0);
        Person peter = new Person("Peter", 20, comp1, 20.0, ad1);
        Person georgi = new Person("Georgi", 30, comp2, 30.0, ad2);
        Person alex = new Person("Alex", 40, 40.0, ad3);
        Car c1 = new Car(peter, comp1, 1600.0);
        comp1.setCeo(peter);
        comp2.setCeo(georgi);
        comp3.setCeo(alex);
        System.out.println(alex.toString());
        System.out.println(ad1.toString());
        System.out.println(t1.toString());
        System.out.println(comp1.toString());
        System.out.println(c1.toString());
    }
}

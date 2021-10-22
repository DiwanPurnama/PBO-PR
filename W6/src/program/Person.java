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
public class Person {
    private final String name;
    private int age;
    private Company company;
    private double income;
    private Address address;

    public Person(String name, int age, Company company, double income, Address address) {
        this.name = name;
        this.age = age;
        this.company = company;
        this.income = income;
        this.address = address;
    }

    public Person(String name, int age, double income, Address address) {
        this.name = name;
        this.age = age;
        this.income = income;
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public Company getCompany() {
        return company;
    }

    public double getIncome() {
        return income;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", company=" + (getCompany()!=null ? getName() : "none") +
                ", income=" + income +
                ", address=" + getAddress().getName() +
                '}';
    }

    
}

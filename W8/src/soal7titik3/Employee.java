/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal7titik3;

/**
 *
 * @author lewis/loftus
 * represents a general paid employee
 */
public class Employee extends StaffMember {
    protected String socialSecurityNumber;
    protected double payRate;
    
    //sets up an employee with the specified information 
    public Employee(String eName, String eAddress, String ePhone, String socSecNumber, double rate){
        super(eName, eAddress, ePhone);
        socialSecurityNumber = socSecNumber;
        payRate = rate;
    }
    
    //return information about an employee as a string
    public String toString(){
        String result = super.toString();
        result += "\nSocial Security Number: "+socialSecurityNumber;
        return result;
    }
    
    //return the pay rate for this employee
    @Override
    public double pay(){
        return payRate;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal7titik3;

/**
 *
 * @author Windows 10
 */
public class Hourly extends Employee{
    private int hoursWorked;
    
    //sets up this hourly emplooyee with the specified information
    public Hourly (String eName, String eAddress, String ePhone, String socSecNumber, double rate){
        super(eName, eAddress, ePhone, socSecNumber, rate);
        hoursWorked=0;
    }
    
    //add the specified number of hours to this employee's accumulated hours
    public void addHours(int moreHours){
        hoursWorked += moreHours;
    }
    
    //compute and returns the pay for this hourly employee
    
    public double pay(){
        double payment = payRate * hoursWorked;
        hoursWorked =0;
        return payment;
    }
    
    //return inftormation about this hourly employee as a string
    public String toString(){
        String result = super.toString();
        result += "\nCurrent hours: "+ hoursWorked;
        return result;
    }
}



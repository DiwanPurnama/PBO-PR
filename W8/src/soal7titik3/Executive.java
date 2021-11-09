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
public class Executive extends Employee {
    private double bonus;
    
    //sets up an executive with the specified information
    public Executive(String eName, String eAddress, String ePhone, String socSecNumber, double rate){
            super(eName, eAddress, ePhone, socSecNumber, rate);
            bonus = 0;
    }
    
    
    //awards the specified bonus to this executive
    public void awardBonus(double execBonus){
        bonus = execBonus;
    }
    
    //computes and returns the pay for an executive, which is the regular employee payment plus a one-time bonus
    public double pay(){
        double payment = super.pay() + bonus;
        return payment;
    }
}

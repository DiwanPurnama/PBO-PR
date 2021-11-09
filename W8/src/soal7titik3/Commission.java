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
public class Commission extends Hourly {
    private double salesMade;
    private double commissionRate;
    
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, 
                       double rate, double commsRate){
        super(eName, eAddress, ePhone, socSecNumber, rate);
        commissionRate = commsRate;
    }
    
    public void addSales(double totalSales){
        salesMade+=totalSales;
    }
    
    public double pay(){
        double payment = super.pay()+ (salesMade*commissionRate);
        salesMade = 0;
        return payment;
    }
    
    public String toString(){
        String result = super.toString();
        result += "\nTotal Sales: "+ salesMade;
        return result;
    }
}

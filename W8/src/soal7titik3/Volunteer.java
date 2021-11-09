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
public class Volunteer extends StaffMember {
        // sets up a volunter using the spesified information 
    public Volunteer(String eName,String eAddress, String ePhone){
        super(eName, eAddress, ePhone);
    }
    
    //return a zero pay value for this volunteer.
    
    public double pay(){
        return 0.0;
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal7titik3;

/**
 *
 * @author lewis/loftus
 * represents a generic staff member
 */
abstract public class StaffMember {
    protected String name;
    protected String address;
    protected String phone;
    
   //Sets up a staff member using the specifief information 
    public StaffMember(String eName, String eAddress, String ePhone){
        name=eName;
        address=eAddress;
        phone=ePhone;
    }
    
    //return a string including the basic employee information 
    public String toString(){
        String result ="Name: "+name+"\n";
        result += "Address: "+address+"\n";
        result += "Phone: "+phone;
        
        return result;
    }
    
    //derived classmust define the pay method for each type of employee
    public abstract double pay();
}

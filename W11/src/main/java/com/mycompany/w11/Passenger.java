/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.w11;

/**
 *
 * @author Windows 10
 */
public class Passenger {
    private String name;
    private boolean vip;
    
    public Passenger(String name, boolean vip){
        this.name=name;
        this.vip=vip;
    }
    
    public String getName(){
        return name;
    }
    
    public boolean isVip(){
        return vip;
    }
}

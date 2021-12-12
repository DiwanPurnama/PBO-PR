/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.w11;
import java.util.*;

/**
 *
 * @author Windows 10
 */
public class Flight {
    
    private String id;
    private List<Passenger> passengers = new ArrayList<Passenger>();
    private String flightType;
    public Flight(String id, String flightType) {
        this.id = id;
        this.flightType = flightType;
    }
    public String getId() {
        return id;
    }
    public List<Passenger> getPassengersList() {
        return Collections.unmodifiableList(passengers);
    }
    public String getFlightType() {
        return flightType;
    }
    
    public boolean addPassenger(Passenger passenger) {
        switch (flightType) {
            case "Economy":
                return passengers.add(passenger);
            case "Business":
                if (passenger.isVip()) {
                    return passengers.add(passenger);
                }
                return false;
            default:
                throw new RuntimeException("Unknown type: " + flightType);
        }
    }
}

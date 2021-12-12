/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugas.week11;

/**
 *
 * @author Windows 10
 */
public class Airport {

    public static void main(String[] args) {
        Flight economyFlight = new EconomyFlight("1");
        Flight businessFlight = new BusinessFlight("2");
        Passenger james = new Passenger("James", true);
        Passenger mike = new Passenger("Mike", false);
        businessFlight.addPassenger(james);
        businessFlight.removePassenger(james);
        businessFlight.addPassenger(mike);
        economyFlight.addPassenger(mike);
        System.out.println("Business flight passenger list: ");
        for (Passenger passenger : businessFlight.getPassengersList()) {
            System.out.println(passenger.getName());
        }
        System.out.println("Economy flight passenger list: ");
        for (Passenger passenger : economyFlight.getPassengersList()) {
            System.out.println(passenger.getName());
        }
    }
}

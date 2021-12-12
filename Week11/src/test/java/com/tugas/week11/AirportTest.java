/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugas.week11;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;

/**
 *
 * @author Windows 10
 */
public class AirportTest {

    @DisplayName("Given there is a business flight")
    @Nested
    class BusinessFlightTest {

        private Flight businessFlight;

        @BeforeEach
        void setUp() {
            businessFlight = new Flight("2", "Business");
        }

        @Test
        public void testBusinessFlightRegularPassenger() {
            Passenger mike = new Passenger("Mike", false);
            assertEquals(false, businessFlight.addPassenger(mike));
            assertEquals(0, businessFlight.getPassengersList().size());
            assertEquals(false, businessFlight.removePassenger(mike));
            assertEquals(0, businessFlight.getPassengersList().size());
        }

        @Test
        public void testBusinessFlightVipPassenger() {
            Passenger james = new Passenger("James", true);
            assertEquals(true, businessFlight.addPassenger(james));
            assertEquals(1, businessFlight.getPassengersList().size());
            assertEquals(false, businessFlight.removePassenger(james));
            assertEquals(1, businessFlight.getPassengersList().size());
        }
    }
}

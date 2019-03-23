/*
 * Creating FlightTest class before creating Flight class following TDD paradigm.
 * Creating the Test class and ensuring that it fails.
 * Later we would code the class and code until we pass all the tests.
 * Subsequently we may clean up the code a little bit.
 */



package org.airline.reservations;

import static org.junit.Assert.*;

import org.junit.Test;

public class FlightTest {

	@Test
	public void test() {
		Flight testFlight1 = new Flight();
		assertEquals("Unknown Departure City", testFlight1.getDepartureCity());
		assertEquals("Unknown Arrival City", testFlight1.getArrivalCity());
		assertEquals(100, testFlight1.getFlightNumber());
	}

}

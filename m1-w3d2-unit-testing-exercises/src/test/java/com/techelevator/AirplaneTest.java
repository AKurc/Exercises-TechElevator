package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AirplaneTest {

	Airplane sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new Airplane("123456", 17, 42);
	}
//is it possible to overbook seats?
//is the count for available seats accurate?
//is the count accurate after successfully booking a seat?
	@Test
	public void testConstructor() {
		assertEquals("123456", sut.getPlaneNumber());
		assertEquals(17, sut.getAvailableFirstClassSeats());
		assertEquals(42, sut.getAvailableCoachSeats());
	}
	@Test
	public void testAccurateCountFirstClass() {
		
		assertEquals(17, sut.getAvailableFirstClassSeats()); //tests constructor
		sut.reserveSeats(true, 16); //firstClass true, and book 16 seats
		assertEquals(1, sut.getAvailableFirstClassSeats()); //tests for 1 seat less than total first class seats
		sut.reserveSeats(true, 1);
		assertEquals(0, sut.getAvailableFirstClassSeats()); //tests last available first class seat
		sut.reserveSeats(true, 1);
		assertEquals(0, sut.getAvailableFirstClassSeats()); //tests over book
		assertEquals(false, sut.reserveSeats(true, 1)); //another way to test reserve seat(over book)
	}
	@Test
	public void testAccurateCountCoach() {
		
		assertEquals(42, sut.getAvailableCoachSeats()); //tests constructor
		sut.reserveSeats(false, 41);
		assertEquals(1, sut.getAvailableCoachSeats()); //tests for 1 seat less than total first class seats
		sut.reserveSeats(false, 1);
		assertEquals(0, sut.getAvailableCoachSeats()); //tests last available first class seat
		sut.reserveSeats(false, 1);
		assertEquals(0, sut.getAvailableCoachSeats()); //test over book
	}

}

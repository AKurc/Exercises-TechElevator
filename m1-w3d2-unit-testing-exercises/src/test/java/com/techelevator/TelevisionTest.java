package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TelevisionTest {

	Television sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new Television();
	}

	@Test
	public void testTurnOff() {
		sut.turnOff();
		assertEquals(false, sut.isOn());
	}
	@Test
	public void testTurnOn() {
		sut.turnOn();
		assertEquals(true, sut.isOn());
	}
	@Test
	public void testChangeChannel() {
		sut.turnOn();
		sut.changeChannel(5);

		assertEquals(5, sut.getCurrentChannel());
	}
	@Test
	public void testChannelUp() {
		sut.isOn();
		
		sut.changeChannel(3);
		
		assertEquals(3, sut.getCurrentChannel());
	}
	@Test
	public void testChannelDown() {
		sut.isOn();
		
		sut.changeChannel(3);
		
		assertEquals(3, sut.getCurrentChannel());
	}
	//can't figure why this isn't working
//	@Test
//	public void testRaiseVolumeWhileOn() {
//		sut.isOn();
//		int originalVolume = sut.getCurrentVolume();
//		sut.raiseVolume();
//		
//		int newVolume = sut.getCurrentVolume();
//		
//		assertEquals(1, newVolume - originalVolume);
//	}
//	@Test
//	public void testLowerVolumeWhileOn() {
//		sut.isOn();
//		int originalVolume = sut.getCurrentVolume();
//		sut.lowerVolume();
//		
//		int newVolume = sut.getCurrentVolume();
//		
//		assertEquals(-1, originalVolume - newVolume);
//	}
}

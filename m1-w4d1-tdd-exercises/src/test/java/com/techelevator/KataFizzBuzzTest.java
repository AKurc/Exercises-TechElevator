package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataFizzBuzzTest {
	KataFizzBuzz sut;
	
	@Before
	public void SetUp() {
		sut = new KataFizzBuzz();
	}
	@Test
	public void returnNumberOne() {
		String result = Integer.toString(1);
		System.out.println(result);
		assertEquals("1", result);
	}
	@Test
	public void returnNumberOneHundred() {
		String result = Integer.toString(100);
		System.out.println(result);
		assertEquals("100", result);
	}
	@Test
	public void returnNumberThree() {
		String result = sut.fizzBuzz(3); //testing method that was named in class-- fizzBuzz
		assertEquals("Fizz", result);
	}
	@Test
	public void returnNumberFive() {
		String result = sut.fizzBuzz(5);
		assertEquals("Buzz", result);
	}
	@Test
	public void returnDerivativeFiveAndThree() {
		String result = sut.fizzBuzz(15);
		assertEquals("FizzBuzz", result);
	}
}
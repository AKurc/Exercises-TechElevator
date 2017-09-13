package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

	Employee sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new Employee(1, "John", "Smith", 1000.00);
	}

//removed @After b/c not putting an exception in it

	@Test
	public void testSalaryMore() {
		sut.RaiseSalary(10.0);
		
		double result = sut.getAnnualSalary();
		
		assertEquals(1100.00, result, 0.001); //0.001 is delta-- variance needed
		
	}
	@Test
	public void testSalaryNegative() {
		sut.RaiseSalary(-10.0);
		
		double result = sut.getAnnualSalary();
		
		assertEquals(900.00, result, 0D);
	}
	@Test
	public void testFullName() {
		String result = sut.FullName();
		
		assertEquals("Smith, John", result);
	}
	@Test
	public void testConstructor() {
		assertEquals(1, sut.getEmployeeId());
		assertEquals("Smith, John", sut.FullName());
		assertEquals(1000.00, sut.getAnnualSalary(), 0.001);
	}
}

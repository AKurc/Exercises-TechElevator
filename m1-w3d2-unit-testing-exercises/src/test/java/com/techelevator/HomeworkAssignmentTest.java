package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HomeworkAssignmentTest {

	HomeworkAssignment sut; //defined above @before so it doesn't end with that block-- now an instance variable so whole test has access to it
	
	@Before //runs before test, runs test, runs after-- runs before every test every single time
	public void setUp() throws Exception {
		sut = new HomeworkAssignment(100);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test //method public void testDoesSomething String(){ //must go above each test-- and test beginning and end range
//	public void testLetterGradeA() {
	public void testLetterGradeALow() { //testLetterGradeAHigh
		//Arange
		sut.setTotalMarks(90); //so handled under each case instead of each method
		
		//Act
		String grade = sut.getLetterGrade();
		
		//Assert
		assertEquals("A", grade); //italicized means it's static via up top import static
	}

}

package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FruitTreeTest {

	FruitTree sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new FruitTree("Apple", 10); //apple is any string- could be cucumber-- 10 is just a number- should have 9 left on tree
	}//creates a brand new object for each test, even though it's the same variable

	@Test
	public void testPickingFewer() { 
		boolean result = sut.pickFruit(9);
		
		assertEquals(true, result);
		assertEquals(1, sut.getPiecesOfFruitLeft());  //expect to have one piece of fruit left on tree, action results in
		
	}
	@Test
	public void testPickingFewerAll() {
		boolean result = sut.pickFruit(10);
		
		assertEquals(true, result);
		assertEquals(0, sut.getPiecesOfFruitLeft());  
		
	}
	
	@Test
	public void testPickingMore() { 
		boolean result = sut.pickFruit(11);
		
		assertEquals(true, result);
		assertEquals(10, sut.getPiecesOfFruitLeft());  
	}
	//also test pick5 and 5- get 0
	@Test
	public void testPickingAllInParts() {
		boolean result = sut.pickFruit(5);
		
		assertEquals(true, result);
		assertEquals(5, sut.getPiecesOfFruitLeft());
		
		result = sut.pickFruit(5);
		assertEquals(true, result);
		assertEquals(0, sut.getPiecesOfFruitLeft());
	}
}

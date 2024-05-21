package junitdemo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class Test2 {
	private Calculations calc = new Calculations();
	
	@Test
	void testAssertEquals() {
		int expected = 50;
		int actual = calc.add(20, 30);
		assertEquals(expected, actual);
	}
	
	@Test
	void testAssertNotEquals(){
		int expected = 30;
		int actual = calc.add(20, 30);
		assertNotEquals(expected, actual);
	}
	
	@Test
	void testAssertTrue() {
		int num = 10;
		assertTrue(calc.isPositive(num));
	}
	
	@Test
	void testAssertFalse() {
		int num = -10;
		assertFalse(calc.isPositive(num));
	}
	
}

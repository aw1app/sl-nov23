package com.simpli;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	public void testAddWhenZeroZero() {
		
		Calculator cal1 = new Calculator();
		
		int a=0;
		int b=0;
		int expectedvalue =0;
		
		int result = cal1.add(a,b);	
		
		
		assertTrue(result==expectedvalue);		
	}
	
	@Test
	public void testAddWhenPositiveNegative() {
		
		Calculator cal1 = new Calculator();
		
		int a=10;
		int b=-6;
		int expectedvalue =4;
		
		int result = cal1.add(a,b);		
		
		assertTrue(result==expectedvalue);		
	}

}

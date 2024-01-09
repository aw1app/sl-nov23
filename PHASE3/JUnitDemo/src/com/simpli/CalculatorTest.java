package com.simpli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@DisplayName("My good calaculator test")
class CalculatorTest {
	static Calculator cal1;

	@BeforeAll
	public static void testAddDoSomeThingBeforeExecutingTheFirstTestCase() {
		System.out.println(" INSIDE BEFORE ALL testAddDoSomeThingBeforeExecutingTheFirstTestCase method");
		cal1 = new Calculator();
	}

	@BeforeEach
	public void testAddDoSomeThingBeforeExecutingTestcase() {
		System.out.println(" INSIDE BEFORE EACH testAddDoSomeThingBeforeExecutingTestcase method");
	}

	@Test
	@Tag("addition")
	public void testAddWhenZeroZero() {

		int a = 0;
		int b = 0;
		int expectedvalue = 0;

		int result = cal1.add(a, b);

		assertTrue(result == expectedvalue);
	}

	@Test
	public void testAddWhenPositiveNegative() {

		int a = 10;
		int b = -6;
		int expectedvalue = 4;

		int result = cal1.add(a, b);

		assertEquals(result, expectedvalue);
	}

	@Test
	public void testDivisionWhenPositiveZero() {

		int a = 10;
		int b = 0;

		assertThrows(ArithmeticException.class, () -> cal1.divide(a, b));
	}

	@AfterEach
	public void testAddDoSomeThingAfterExecutingTestcase() {
		System.out.println(" INSIDE AFTER EACH testAddDoSomeThingAfterExecutingTestcase method");
	}

	@AfterAll
	public static void testAddDoSomeThingAfterExecutingTheLastTestCase() {
		System.out.println(" INSIDE AFTER ALL testAddDoSomeThingAfterExecutingTheLastTestCase method");
	}

}

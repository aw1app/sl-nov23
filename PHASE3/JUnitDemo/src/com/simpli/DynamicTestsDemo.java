package com.simpli;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import static org.junit.jupiter.api.DynamicTest.dynamicTest;

class DynamicTestsDemo {

	@TestFactory
	Collection<DynamicTest> dynamicTests1() {

		DynamicTest dynTest1 = dynamicTest("Dynamic test 1", () -> assertTrue(7 == new Calculator().add(2, 5)));

		DynamicTest dynTest2 = dynamicTest("Dynamic test 2 for cal div",
				() -> assertTrue(2 == new Calculator().divide(5, 2)));

		return Arrays.asList(dynTest1, dynTest2);
	}

	@TestFactory
	Collection<DynamicTest> dynamicTests2() {

		Collection<DynamicTest> dynamicTests = new ArrayList<DynamicTest>();

		
		for (int i = 0; i < 5; i++) {
			int x=i;
			dynamicTests.add(dynamicTest("Dynamic test for a="+x, () -> assertTrue(7 == new Calculator().add(x, 5))));
		}

		return dynamicTests;

	}

}

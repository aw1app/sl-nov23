package com.simpli;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import static org.junit.jupiter.api.DynamicTest.dynamicTest;


class DynamicTestsDemo {

	@TestFactory
	Collection<DynamicTest> dynamicTests1() {

		DynamicTest dynTest1 = dynamicTest("Dynamic test 1", () -> assertTrue(7 ==new Calculator().add(2, 5)));
		
		DynamicTest dynTest2 = dynamicTest("Dynamic test 2 for cal div", () -> assertTrue(2 ==new Calculator().divide(5, 2)));
		
		return Arrays.asList(dynTest1,dynTest2);

	}

}

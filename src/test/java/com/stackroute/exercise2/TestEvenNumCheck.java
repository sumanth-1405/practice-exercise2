package com.stackroute.exercise2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestEvenNumCheck {

	@Test
	void testTrue() {
		assertEquals(true, EvenNumCheck.isEven(42));
	}

	@Test
	void testFalse() {
		assertEquals(false, EvenNumCheck.isEven(35));
	}

}

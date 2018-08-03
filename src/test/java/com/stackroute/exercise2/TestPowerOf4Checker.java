package com.stackroute.exercise2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPowerOf4Checker {

	@Test
	void testTrue() {
		assertEquals(true, PowerOf4Checker.isDivisionInt(16));
	}

	@Test
	void testFalse() {
		assertEquals(false, PowerOf4Checker.isDivisionInt(31));
	}

}

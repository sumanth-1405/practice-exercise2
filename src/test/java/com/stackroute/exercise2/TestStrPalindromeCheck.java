package com.stackroute.exercise2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestStrPalindromeCheck {

	@Test
	void testTrue() {
		assertEquals(true, StrPalindromeCheck.isPalindrome("radar"));
	}

	@Test
	void testTrue1() {
		assertEquals(true, StrPalindromeCheck.isPalindrome("tet tet"));
	}

	@Test
	void testFalse() {
		assertEquals(false, StrPalindromeCheck.isPalindrome("qwerty"));
	}

}

package com.stackroute.exercise2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestStudentsGrades {
	int[] input= {67,78,86,91};

	@Test
	void testAvg() {
		assertEquals(80.5, StudentsGrades.avgGrade(input));
	}

	@Test
	void testMax() {
		assertEquals(91, StudentsGrades.maxGrade(input));
	}

	@Test
	void testMin() {
		assertEquals(67, StudentsGrades.minGrade(input));
	}

}

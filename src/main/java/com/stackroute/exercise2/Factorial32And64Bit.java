package com.stackroute.exercise2;

public class Factorial32And64Bit {
	public static void main(String[] args) {
		System.out.println("Int Factorials:");
		int fact = 1, n = 100, MAX_VALUE = 2147483647;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
			if (fact > 0 && fact <= MAX_VALUE) {
				System.out.printf("The factorial of %d is %d\n", i, fact);
			} else {
				System.out.printf("The factorial of %d is out of range\n", i);
				break;
			}

		}
		longFactorial();
	}
	
	public static void longFactorial() {
	System.out.println("Long Factorials:");

	long fact=1,n=100;for(
	int i = 1;i<=n;i++)
	{
		fact = fact * i;
		if (fact > 0 && fact <= Long.MAX_VALUE) {
			System.out.printf("The factorial of %d is %d\n", i, fact);
		} else {
			System.out.printf("The factorial of %d is out of range", i);
			break;
		}

	}

	}
}

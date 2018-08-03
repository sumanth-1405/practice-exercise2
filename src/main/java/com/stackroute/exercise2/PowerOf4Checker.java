package com.stackroute.exercise2;

import java.util.Scanner;

/**
 * @author sumanth reddy 
 * program to check whether the given input is power of 4 or not
 */
public class PowerOf4Checker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int input = sc.nextInt();
		boolean result = isDivisionInt(input);
		System.out.println(result);
		sc.close();
	}

	/**
	 * @param input
	 * @return result method to check whether the division is an integer or not
	 */
	public static boolean isDivisionInt(int input) {
		boolean result = false;
		double num = (Math.log(input) / Math.log(4));
		if (num == (int) num) {
			result = true;
		}
		return result;
	}
}

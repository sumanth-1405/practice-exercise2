package com.stackroute.exercise2;

import java.util.Scanner;

/**
 * @author sumanth reddy 
 * program to check the given input is palindrome or not
 */
public class StrPalindromeCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input");
		String input = sc.nextLine();
		boolean result = isPalindrome(input);
		System.out.println(result);
		sc.close();

	}

	/**
	 * @param input
	 * @return result 
	 * method to check palindrome
	 */
	public static boolean isPalindrome(String input) {
		String reverse = "";
		boolean result=false;
		int len = input.length();
		for (int i = len - 1; i >= 0; i--) {
			reverse += input.charAt(i);
		}

		if (input.matches(reverse)) {
			result = true;
		} 

		return result;
	}

}

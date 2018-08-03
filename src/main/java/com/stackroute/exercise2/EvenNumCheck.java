package com.stackroute.exercise2;

import java.util.Scanner;

/**
 * @author sumanth reddy
 * program to check whether the given integer is even or not
 */
public class EvenNumCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		boolean result = isEven(number);
		System.out.println(result);
		sc.close();
	}

	/**
	 * @param number
	 * @return result
	 * method to check whether number is even
	 */
	public static boolean isEven(int number) {
		boolean result=false;
		if(number%2==0) {
			result=true;
		}
		
		return result;
	}

}

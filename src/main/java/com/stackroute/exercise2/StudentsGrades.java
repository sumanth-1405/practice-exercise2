package com.stackroute.exercise2;

import java.util.Scanner;

/**
 * @author sumanth reddy
 * program to print the maximum,minimum and average of grades of n students
 */
public class StudentsGrades {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the number of students");
		int n = sc.nextInt();
		int[] input = gradeInput(n);
		double avg = avgGrade(input);
		System.out.println("The average is " + avg);
		int min = minGrade(input);
		System.out.println("The minimun is " + min);
		int max = maxGrade(input);
		System.out.println("The maximum is " + max);

	}

	/**
	 * @param input
	 * @return avg
	 * method to calculate the average of given grades
	 */
	public static double avgGrade(int[] input) {
		double sum = 0;
		int len = input.length;
		for (int i = 0; i < len; i++) {
			sum += input[i];
		}
		double avg = sum / len;
		return avg;
	}

	/**
	 * @param input
	 * @return min
	 * method to calculate the minimum of given grades
	 */
	public static int minGrade(int[] input) {
		int min = input[0];
		for (int i = 0; i < input.length; i++) {
			if (input[i] < min) {
				min = input[i];
			}
		}
		return min;
	}

	/**
	 * @param input
	 * @return max
	 * method to calculate the minimum of given grades
	 */
	public static int maxGrade(int[] input) {
		int max = input[0];
		for (int i = 0; i < input.length; i++) {
			if (input[i] > max) {
				max = input[i];
			}
		}
		return max;
	}

	/**
	 * @param n
	 * @return grade
	 * method to take input grades from the user and arranging them in an array
	 */
	public static int[] gradeInput(int n) {
		int[] grade = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.printf("Enter the grade for student %d: ", i + 1);
			grade[i] = sc.nextInt();
		}
		return grade;
	}

}

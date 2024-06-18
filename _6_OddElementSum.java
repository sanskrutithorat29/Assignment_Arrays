package com.javaArrayAssignment;

public class _6_OddElementSum {
	/*
	 * Write a Java program to calculate sum of odd numbers from an given array. the
	 * array is 'int[ ] values = {24, 36, 47, 27, 13, 9, 5};'.
	 */
	public static void main(String[] args) {
		int values[] = { 24, 36, 47, 27, 13, 9, 5 };
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			if (values[i] % 2 != 0) {
				sum = sum + values[i];
			}
		}
		System.out.println("The sum of all odd numbers are: " + sum);
	}

}

package com.javaArrayAssignment;

public class _7_EvenIndexSum {
	/*
	 * Write a Java program to calculate sum of numbers at even index from an given
	 * array. the array is 'int[ ] values = {4, 6, 7, 2, 13, 9, 5};'.
	 */
	public static void main(String[] args) {
		int values[] = { 4, 6, 7, 2, 13, 9, 5 };
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			if (i % 2 == 0) {
				sum = sum + values[i];
			}
		}
		System.out.println("Sum of all even index number is: " + sum);
	}

}

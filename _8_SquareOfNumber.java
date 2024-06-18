package com.javaArrayAssignment;

public class _8_SquareOfNumber {
	/*
	 * Write a Java program to calculate sum of square of numbers divisible by 3
	 * from an given array. the array is 'int[ ] values = {4, 6, 7, 2, 12, 9, 15};'.
	 */
	public static void main(String[] args) {
		int values[] = { 4, 6, 7, 2, 12, 9, 15 };
		int square = 0;
		for (int i = 0; i < values.length; i++) {
			if (values[i] % 3 == 0) {
				square += values[i] * values[i];

			}
		}
		System.out.println("Square is: " + square);
	}

}

package com.javaArrayAssignment;

/*
 * Write a Java program to calculate the average value 
 * of array elements. the
 * array is 'int array[ ] = {55, 66, 44, 22, 55, 77}'
 */
public class _2_AverageOfElements {

	public static void main(String[] args) {
		double avg = 0;
		double sum = 0;
		int array[] = { 55, 66, 44, 22, 55, 77 };
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
			avg = (sum) / (array.length);
		}
		System.out.println("The average is: " + avg);

	}

}

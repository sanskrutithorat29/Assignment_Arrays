package com.javaArrayAssignment;

/*
 * Write a Java program to find the maximum and minimum value 
 * from a given an
 * array. array is 'int array[ ] = {45, 67, 98, 63, 59, 24, 48}'
 */
public class _3_MinMaxElement {

	public static void main(String[] args) {
		int array[] = { 45, 67, 98, 63, 59, 24, 48 };
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("Maximum element is:" + max);

		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.println("Minimum element is:" + min);
	}

}

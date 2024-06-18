package com.javaArrayAssignment;

/*
 * Write a Java program to sum values of an given array. 
 * the array is 'int[ ]
 * values = {34, 56, 78, 20, 78, 90, 74};'.
 */
public class _1_SumOfElements {

	public static void main(String[] args) {
		int sum = 0;
		int arr[] = { 34, 56, 78, 20, 78, 90, 74 };
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("The sum of array is:" + sum);
	}

}

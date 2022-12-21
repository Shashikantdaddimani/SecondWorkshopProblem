package com.java.array;

public class SecondLargestElement {
	/*
	 * method for finding the second largest Elements for given Elements
	 */
	public static int getSecondLargest(int array[], int length) {
		int temp;
		/*
		 * Logic for sorting the array elements
		 */
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array[length - 2];

	}

}

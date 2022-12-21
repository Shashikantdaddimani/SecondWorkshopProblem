package com.java.array;

/**
 * imports the Scanner class of the java.util package
 */
import java.util.Scanner;

public class SecondLargestElementMain {

	/*
	 * program execution start from main method
	 */
	public static void main(String[] args) {
		/*
		 * Taking user input using Scanner object
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = input.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the array of elements");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		/*
		 * created class Object and using object to call the getSecondLargest() method.
		 */
		SecondLargestElement object = new SecondLargestElement();
		System.out.println("the second largest element is:" + object.getSecondLargest(array, size));

	}

}

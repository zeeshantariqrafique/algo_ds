/**For this problem, The goal is to sort an array of 0, 1 and 2's but you must do this in place, 
 * in linear time and without any extra space (such as creating an extra array). 
 * This is called the Dutch national flag sorting problem. 
 * For example, if the input array is [2,0,0,1,2,1] then your program should output [0,0,1,1,2,2] 
 * and the algorithm should run in O(n) time.
 * */

package com.algo.ds.practice;

import java.util.Scanner;

public class DutchNationalFlag {

	/**
	 * Utility function to print array passed as parameter
	 **/
	public static void printArr(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}

	}

	/**
	 * utility function to swap 2nd and 3rd parameter
	 **/
	static void swap(int[] array, int a, int b) {
		array[a] = array[a] + array[b];
		array[b] = array[a] - array[b];
		array[a] = array[a] - array[b];
	}

	/**
	 * Logic for Dutch national flag problem Sample Input : {1,0,0,2,1,0,1,2,1,0}
	 * Sample Output :{0,0,0,0,1,1,1,1,2,2}
	 **/
	public static void dutchNationalFlag(int[] array) {
		int low = 0;
		int middle = 0;
		int temp = 0;
		int high = array.length - 1;
		while (middle <= high) {

			if (array[middle] == 0) {
				swap(array, low, middle);
				middle++;
				low++;
			} else if (array[middle] == 1)
				middle++;
			else {
				swap(array, middle, high);
				high--;
			}
		}
	}

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Please enter the size of the array ");
			final int size = scan.nextInt();
			int inputArr[] = new int[size];
			int count = 0;
			System.out.println("Enter elements of array , Values should be between 0 , 1 and 2");
			while (scan.hasNext()) {
				inputArr[count++] = scan.nextInt();
				if (count == size) {
					break;
				}
			}
			dutchNationalFlag(inputArr);
			printArr(inputArr);
		}
	}
}

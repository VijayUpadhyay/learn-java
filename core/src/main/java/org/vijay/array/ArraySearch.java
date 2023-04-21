package org.vijay.array;

import java.util.Arrays;

public class ArraySearch {
	public static void main(String[] args) {
		int[] arr = {5, 8, 12, 56, 83};
		int index = Arrays.binarySearch(arr, 121);
		System.out.println(index);
	}
}

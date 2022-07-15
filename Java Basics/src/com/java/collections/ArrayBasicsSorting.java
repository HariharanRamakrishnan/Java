package com.java.collections;

import java.util.Arrays;

public class ArrayBasicsSorting {

	public static void main(String[] args) {
		int[] arr = {10, 4, 3, 8, 32, 21};
		System.out.println("Before Sorting");
		for(int i:arr) {
			System.out.println(i);
		}
		Arrays.sort(arr);
		System.out.println("After Sorting");
		for(int i:arr) {
			System.out.println(i);
		}
	}

}
 
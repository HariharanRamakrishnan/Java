package com.java.collections;

import java.util.Arrays;
import java.util.List;

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
		Object[] companies = {12, "Hari", 'R', 35000.98};
	    //Company[] companies = {12, "Hari", 'R', 35000.98};
		Arrays.sort(companies);
		for(Object company:companies) {
			System.out.println(company);
		}
	}

}
 
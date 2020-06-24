package com.kita.first.level2;

import java.util.Arrays;

public class ArrCopy {
	public static void main(String[] args) {
		int[] arr = {2, 4, 6, 7, 10, 55};
		int[] arr2 = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			arr2[i] = arr[i];
		}
		
		
		System.out.println(arr == arr2);
		System.out.println("arr : " + Arrays.toString(arr));
		
		
		
		/*
		if(arr2 != null) {
			System.out.println("arr2 : " + Arrays.toString(arr2));
		}
		*/
		System.out.println("arr2 : " + Arrays.toString(arr2));
		
		arr2[1] = 35;
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("arr2 : " + Arrays.toString(arr2));
		
		int[] arr3 = {1, 2, 3, 4};
		System.out.println(Arrays.toString(arr3));
		
	}
	
}

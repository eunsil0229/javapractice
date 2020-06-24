package com.kita.first.level2;

public class ArrayOrder {
	public static void main(String[] args) {
		
		// 순차정렬
		// 오름차순으로 정렬
		int[] arr = {29, 33, 15, 88, 5, 46, 92, 1, 19};
		
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		System.out.println("---------------------");
		
		for(int i=0; i<(arr.length-1); i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			if(i>0) {
				System.out.print(", ");
			}
			System.out.print(arr[i]);
		}
		
		System.out.println();
		
		for(int num : arr) {
			System.out.print(num + " ");
		}
		
		
		
	}
}

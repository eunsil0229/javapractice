package com.kita.first.level2;

public class ArrayOrder2 {
	public static void main(String[] args) {
		// least의 인덱스 숫자를 바꾼다

		int arr[] = {13, 18, 2, 90, 7, 44, 8, 56};
		int min;

		
		for (int i=0; i<(arr.length - 1); i++) {
			min = i;
			for (int j=(i + 1); j<arr.length; j++) {
				if(arr[min] > arr[j]) {
					min = j;
				}
			}
			
			if(min != i) {
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
		
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

}

package com.kita.first.level2;

public class ArrayOrder3 {
	public static void main(String[] args) {
		// 버블정렬
		int[] arr = {19, 12, 1, 34, 24, 29, 3, 33, 2, 15, 88, 5, 92, 46};
		
		// z 정렬이 5번까지, 4번까지, 3번까지...
		// z 1보다 0이 크면 자리바꾸기 -> 암튼 옆옆
		// 0 1 2 3 4 5  6
		// 0 1 2 3 4 	5
		// 0 1 2 3 		4
		// 0 1 2 		3
		// 0 1 			2
		// 0 			1
		
		/*
		for(int i=1; i<arr.length; i++) {
			for(int j=0; j<(arr.length-i); j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		*/
		
		for(int i=(arr.length-1); i>0; i--) { 
			for(int j=0; j<i; j++) {		  
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int num : arr) {
			System.out.print(num + " ");
		}
		
	} 

}

package com.kita.first.mission;

public class SelfStudy {
	public static void main(String[] args) {
		int[] arr = {19, 12, 1, 34, 24, 29, 3, 33, 2, 15, 88, 5, 92, 46};
		
		/*
		// 순차정렬
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] =  temp;
				}
			}
		}
		*/
		
		
		/*
		// 선택정렬
		// length : 6
		//	i	j
		// 	0	1 2 3 4 5 
		//	1	2 3 4 5
		//	2	3 4 5
		//	3 	4 5
		//	4 	5
		//	--------------
		//	5 -> z때문에 안 됨
		// i의 범위 = length-1
		// z 범위 = length
		
		
		int min;
		
		for(int i=0; i<arr.length-1; i++) {
			min = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[min]>arr[j]) {
					min = j;
				}
			}
			
			if(min != i) {
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
		*/
		
		
		// 버블 정렬
		// 옆만 비교
		// i가 도는 횟수만 상관 있지 범위 그 자체는 딱히 상관 없음
		// i가 도는 횟수 = length-1
		// j의 최대 범위는 1씩 줄어듦 -> 최초의 최대 범위는 무엇인가?? -> length-2 = (length-1)-1 = i-1
		//						그 다음 최대 범위는??		-> length-2 -1 = i-1 -1 -> i의 다음차례 -1
		
		for(int i=(arr.length-1); i>0; i--) {
			for(int j=0; j<i; j++) {
				if(arr[j]>arr[j+1]) {
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

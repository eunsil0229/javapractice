package com.kita.first.mission;

public class Mission9 {
	public static void main(String[] args) {
		/*
		 * arr 1부터 100 값이 들어가도록 해주세요 순서대로
		 * 0번방에 1
		 * 1번방에 2
		 * ...
		 * 99번방에 100
		 * ----
		 * 각 방에 있는 모든 값을 더한 후 결과값 출력
		 * ----
		 * 각각 for문 따로		 
		 */
		
		int[] arr = new int[10];
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (i+1);
			
		}
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum);
		
		sum = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = ((i+1)*2);
		}
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum);
		
		System.out.println("-------------------");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			if(i<arr.length-1) {
				System.out.print(", ");
			}
			
		}
		System.out.println("\n-------------");
		
		for(int i=0; i<arr.length; i++) {
			if(i>0) {
				System.out.print(", ");
			}
			
			System.out.print(arr[i]);
		}
		
		
		
		/*
		 * System.out.println("--------------------------");
		int[] arr1 = new int[100];
		for(int i=0; i<(arr1.length)*2; i++) {
			arr[0] = 2;
			if(i % 2 == 0 && i != 0) {
				arr1[i/2] = i;
			}
			System.out.println(i/2 + " : " +arr1[i]);
		}
		
		
		*/
		
		
		
	}

}

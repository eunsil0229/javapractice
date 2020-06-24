package com.kita.first.level2;

public class Array {
	public static void main(String[] args) {
		// 배열도 reference 변수
		int[] arr = new int[100]; // new는 객체화시킬 때 쓰는 keyword // 초기화를 하지 않은 경우 기본값으로 정수나 실수 타입은 0, boolean은 false
		// int arr[]도 사용 가능하나, 배열 타입이 아니라 int 타입으로 보일 수 있으므로 비추천!
		char[] arr2 = new char[20]; // 기본값 : 빈 칸 -> int로 바꾸면 0
		float[] arr3 = new float[10]; // 타입[] 이름 = new 타입[값의 개수];
		String[] arr4 = new String[200]; // reference 타입은 초기화를 하지 않은 경우 기본값으로 null이 들어가 있음 -> null은 주소값이 없음
		
		int[] arr5 = {10, 20, 30, 40};
		int[] arr6 = arr5;
		
		System.out.println(arr5); // -> 주소값을 볼 수 있기는 하나 완벽하지는 않음
		System.out.println(arr6);
		
		// 값 넣는 방법
		int[] arr7 = new int[4];
		arr7[0] = 10;
		arr7[1] = 20;
		arr7[2] = 30;
		arr7[3] = 40;
		// int[] arr7 = {10, 20, 30, 40};과 동일함
		
		// 값 사용 방법
		System.out.println(arr7[0]);
		System.out.println(arr2[10]);
		
		// 배열 사용 이유 : 변수를 덜 사용하고, for문과 같이 쓰며 작업을 줄이기 위해서
		
		System.out.println("--------------------------------------");
		
		int[] arr8 = new int[100];
		
					// ┌ 아래에 100을 집어넣는 것 보다 arr8.length를 사용!
		for(int i=0; i<100; i++) {			// 넣는 for문과 출력하는 for문 따로 만들기! (수정 용의) // 메소드를 만들 때 하나의 메소드 당 하나의 기능만 적용하기!
			arr8[i] = 5;
		}
		
		for(int i=0; i<arr8.length; i++) {		// .은 reference 변수 밖에 못 씀 // 주소값.~~ -> 아주 중요!!!
			arr8[i] = 5;
		}
		
		for(int i=0; i<arr8.length; i++) {			// 넣는 for문과 출력하는 for문 따로 만들기! (수정 용의)
			System.out.println(i + " : " + arr8[i]);
		}
		
		// 만약에 이미 만들어져있는 배열이 있는데 값을 추가로 더 집어넣고 싶은 경우 배열을 하나 더 만들고 for문으로 원래 배열을 복사한 후 if를 사용하든 뭘 하든 원하는 값을 집어넣음
		
		
		
		
		
	}

}

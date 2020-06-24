package com.kita.first.level2;

public class Method4 {
	public static void main(String[] args) {
		sum(4, 5);
		sum(5, 7, 9);
		sum(1, 2, 3, 4);
	}

	// 오버로딩하려는 매개변수가 무한대로 늘어날 경우
	
	public static void sum(int ...arr) { // 같은 타입의 매개변수들만 가능
		// 가변인자 or 가변인수 - ...arr 처럼 앞에 ...을 넣으면 매개변수들이 배열로 만들어 짐
		// (int a, int ...arr) 이렇게 쓰면 두번째 숫자부터 arr 배열에 들어감 
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum : " + sum);
	}
	
	
}

package com.kita.first.level2;

public class NormalVsRef {
	public static void main(String[] args) {
		int num = 10;
		System.out.println("before num : " + num);
		changeVal(num); // 그렇다고 위에 썼던 num이 30으로 바뀌지는 않음
		System.out.println("after num : " + num);
		
		int[] numArr = {10}; // 10의 주소값이 numArr[0]에 저장됨
		System.out.println("before num[0] : " + numArr[0]);
		changeVal(numArr); // 주소값을 알고 있기 때문에 값이 바뀌어버림
		System.out.println("after num[0] : " + numArr[0]);
		
	}

	
	public static void changeVal(int num) {
		num = 30;
	}
	
	public static void changeVal(int[] numArr) {
		numArr[0] = 30;
	}
}

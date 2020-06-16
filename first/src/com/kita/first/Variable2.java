package com.kita.first;

public class Variable2 {
	public static void main(String[] args) {
		int num = 10;
		int num2, num3 = 20;
		int num4 = 10, num5 = 20; // 같은 타입인 경우
		
		
		// 이름 지을 때  주의사항
		// 1. 소문자로 시작해야 함(가능한 카멜 케이스 기법 사용) ex) int myMaxHeight
		// 2. 특수 기호는 _, $ 두 개만 사용 가능(특수 기호로 시작해도 무방)
		// 3. 숫자로 시작하면 안됨
		// 4. 예약어(보라색 글자) 사용 금지
		// 5. 변수명 사이에 공백 사용 금지(공백 사용하고 싶으면 _ 사용)
		// 6. 대소문자를 가림
		// 책 25P 보면 됨
		
		// 상수 - 한 번 입력되면  절대 바뀌지 않는 값
		final int NUM = 10;	 // 상수명은 무조건 대문자, 구분은 언더바로 해야 함
		final int MY_MAX_HIEGHT = 20;
		// NUM = 20; -> error!
		
		// 정수 안에 자리 구분으로 , 대신 _ 사용 가능  ex) int a = 1_000_000;
		
		
		
		
		
			
	}

}

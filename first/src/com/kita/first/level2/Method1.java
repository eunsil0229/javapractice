package com.kita.first.level2;

public class Method1 {
	public static void main(String[] args) { // void main 어쩌구 - 메소드 구성 요소
		// 위치에 따라 메소드 또는 함수라고 부름
		// 객체 안에 있으면 메소드 밖에 있으면 함수
		// 그러나 자바는 모든 소스는 클래스 안에 있기 때문에 메소드라는 단어만 사용, 함수 개념 없음!!
		// 메소드 안에다가 메소드 정의 절대 못함!!!(어떤 언어든!) 호출은 가능
		// 메소드 사용 이유 : 소스를 효율적으로 사용할 수 있음
		
		
		
		// public static 지금은 일단 먼저 쓴다!!
		
		// 메소드의 구성 : 리턴타입, 메소드명, 파라미터(매개변수)  -> 메소드 선언부 {
		//													메소드 구현부	}
		// 리턴타입 - void와 비void로 나뉨
		// 리턴(회신) : 리터럴값과 일반값 밖에 없음
		
		// 메소드 호출
		sum1(10, 15);  // 보라색 글자 옆 괄호 말고 괄호가 있을 경우 무조건 메소드랑 연관되어 있음
		//	└ 2개의 매개변수를 선언했으면 호출할 때도 2개의 값을 보내야 함! + 타입도 맞아야 함(int면 int)
		
		/*
		// sum2(10, 15); -> 사용 불가능
		// static이 없으면 꼭 개체를 만든 후에 사용해야 함
		Method1 method1 = new Method1();
		method1.sum2(10, 15);
		*/
		
		minus(20, 5);
		// 호출할 때 넣는 값은 인수(argument)
		
	}
	
	
	// 메소드 선언
	public static void sum1(int n1, int n2) {
		System.out.println(n1 + n2);
		// return; 자동으로 들어가 있음, return 후에는 무조건 종료이므로 return 아래에는 소스를 넣지 말 것! 
	}
	
	public void sum2(int n1, int n2) {
		System.out.println(n1 + n2);
	}
	
	public static void minus(int n1, int n2) {
		System.out.println(n1 - n2);
	}
	

}

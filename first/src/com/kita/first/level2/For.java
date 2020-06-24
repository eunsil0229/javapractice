package com.kita.first.level2;

public class For {
	public static void main(String[] args) {
		for(int i = 100; i < 110 ; i++) { // 비워두는 것 = 무한 반복문 
			// 초기값 ; 조건 ; 증감식
			// 1. 초기값은 처음에 딱 한 번만 실행됨
			// 2. 두번째 조건식 실행됨 
			// 3. 중괄호 { } 안 실행문 실행됨
			// 4. 증간식 실행됨
			// 2 -> 3 -> 4 -> 2 -> 3 -> 4 -> ...
		
			System.out.println((i-99) + ". 반복문");

		}
	}

}

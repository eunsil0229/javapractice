package com.kita.first;

public class Variable3 {
	public static void main(String[] args) {
		int n1 = 2147483647;;
		float n5 = n1; // 앞에 (float)를 안 붙여도 자동으로 타입 변환이 됨
		long n4 = 222222;	
		float n2 = 50.2f;
		double n3 = n2;
		
		float result = n2 + n1;
		int result2 = (int)n2 + n1;

		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
		// 타입끼리 사칙연산을 할 때 더 큰 타입으로 자동 변변환됨
		
		
	}

}

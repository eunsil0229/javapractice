package com.kita.first;

public class Operate5 {
	public static void main(String[] args) {
		// 비교연산자 > boolean
		int n1 = 12;
		int n2 = 11;
		boolean result = (n1 == n2);
		System.out.println(result);
		System.out.println(n1 == n2);
		System.out.println(n1);
		
		System.out.println();
		result = (n1 != n2);
		System.out.println(result);
		System.out.println(n1 != n2);

		System.out.println();
		result = n1 >= n2;
		System.out.println("n1 > n2 : " + !!result);
		result = n2 >= n1;
		System.out.println("n2 > n1 : " + result); 
		
		// ☆★ ==으로 비교하면 안 되는 것 : 문자열 ☆★
		
		
		
	}

}

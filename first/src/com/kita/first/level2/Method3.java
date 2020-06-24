package com.kita.first.level2;

public class Method3 {
	public static void main(String[] args) {
	
		int result = sum(15, 10);
		System.out.println(result);
		

		System.out.println("-----");
		int result2 = minus(20, 10);
		System.out.println(result2);
		
		
		
	} // 메인  끝
	
	
	public static int sum(int n1, int n2) {
		return n1 + n2;
	}
	
	public static int minus(int n1, int n2) {
		return n1 - n2;
	}
	
	
	
	
	
	
	
	
}

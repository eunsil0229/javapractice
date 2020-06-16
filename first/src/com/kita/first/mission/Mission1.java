package com.kita.first.mission;

public class Mission1 {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 3;
		double result = n1 / (double) n2; // n1은 자동으로 double로 type 변환이 됨
		
		System.out.println(result);
		System.out.printf("%.1f\n", result);
		
		double result2 = result * 10;
		int result3 = (int)result2;
		double result4 = (double)result3 / 10;
		
		System.out.println(result4);
		
		
	}

}

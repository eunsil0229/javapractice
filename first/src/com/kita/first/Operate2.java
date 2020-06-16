package com.kita.first;

public class Operate2 {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 10;
		
		int result = n1++; // result에는 원래 n1값인 10이 들어가고 그리고 n1이 11이 됨
		System.out.println("result : " + result); 
		System.out.println("n1 : " + n1);
		
		int result2 = ++n2; // n2에 1이 더해진 후에 result2에 11이 저장이 됨
		System.out.println("result2 : " + result2);
		System.out.println("n2 : " + n2);
	}

}

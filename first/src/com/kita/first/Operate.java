package com.kita.first;

public class Operate {
	public static void main(String[] args) {
		int n1 = 10;
		n1++;
		System.out.println(n1); // n1은 11로 바뀜
		
		int n2 = 10;
		System.out.println(n2 + 1); // n2는 여전히 10
		System.out.println(n2);
		
		++n1;
		System.out.println(n1);
		
		System.out.println("---------------------");
	}

}

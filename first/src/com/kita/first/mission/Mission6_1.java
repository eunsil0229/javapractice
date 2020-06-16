package com.kita.first.mission;

public class Mission6_1 {
	public static void main(String[] args) {
		int dan = 4;
		
		for(int i=1 ; i < 10 ; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, (dan*i));
		}
		System.out.println();
		
		for(int i=14; i < 23; i++) {
			System.out.printf("%d * %d = %d\n", dan, (i-13), (dan*(i-13)));
		}
		System.out.println();
		
		for(int i=10; i < 19; i++) {
			System.out.printf("%d * %d = %d\n", dan, (i-9), (dan*(i-9)));
		}
		
		

		
	}
}

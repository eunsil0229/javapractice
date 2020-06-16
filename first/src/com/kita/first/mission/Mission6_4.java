package com.kita.first.mission;

public class Mission6_4 {
	public static void main(String[] args) {
		
		for(int i=1; i<10; i++) {
			for(int j=2; j<10; j++) {
				System.out.printf("%d * %d = %d\t", j, i, (i*j));
			}
			System.out.println();
		}
		
		int star = 10;
		for(int i=star; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0; i<star; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	


}

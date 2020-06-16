package com.kita.first.mission;

import java.util.Scanner;

public class Mission6_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("별의 개수를 입력하세요 : ");
		int star = scanner.nextInt();
	
		
		for(int i=0; i<star; i++) {
			System.out.print("*");
		}
		System.out.println();
		
	}

}


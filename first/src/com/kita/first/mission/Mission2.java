package com.kita.first.mission;

import java.util.Scanner;

public class Mission2 {
	public static void main(String[] args) {
		/* 스캐너로 정수값을 하나 입력 받고
		 * 그 값이 홀수면 "홀수입니다."
		 * 그 값이 짝수면 "짝수입니다."
		 */
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num1 = scanner.nextInt();
		int num2 = num1 % 2;
		
		if(num2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		
		
		
		
		if(num1 == 0) {
			System.out.println("0입니다.");			
		} else {
			if(num2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
		}
	
		
		
	}

}

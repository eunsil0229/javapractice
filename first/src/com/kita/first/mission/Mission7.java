package com.kita.first.mission;

import java.util.Scanner;

public class Mission7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		/*
		while(true) {
			System.out.print("숫자를 입력(종료 : 0) : ");
			int num = scanner.nextInt();
			sum += num;
			
			if(num ==  0) {
				break;
			}
		}
		System.out.println("합계 : " + sum);
		*/
		
		sum = 0;
		while(true) {
			System.out.print("숫자를 입력(종료 : 0) : ");
			int num = scanner.nextInt();
			
			if(num ==  0) {
				break;
			} else if(num % 2 == 0) {
				sum += num;
			}
		}
		scanner.close();
		System.out.println("합계 : " + sum);
	
		
		
	}

}

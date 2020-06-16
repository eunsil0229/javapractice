package com.kita.first.mission;

import java.util.Scanner;

public class Mission3 {
	public static void main(String[] args) {
		
		/* 
		 * 성별을 입력해주세요 : (남 /여)
		 * 키를 입력해주세요 :
		 * 
		 * 남자 기준 : 160
		 * 여자 기준 : 150
		 * 
		 * "평균 미만입니다."
		 * "평균입니다."
		 * "평균 초과입니다."
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("성별을 입력해주세요(남/여) : ");
		String gender = scanner.next();
		
		System.out.print("키를 입력해주세요 : ");
		int height = scanner.nextInt();
		
		if("남".equals(gender)) {
			if(height > 160) {
				System.out.println("평균 초과입니다.");
			} else if(height == 160) {
				System.out.println("평균입니다.");
			} else {
				System.out.println("평균 미만입니다.");
			}
		} else { // else if("여".equals(gender)
			if(height > 150) {
				System.out.println("평균 초과입니다.");
			} else if(height == 150) {
				System.out.println("평균입니다.");
			} else {
				System.out.println("평균 미만입니다.");
			} 
		}  // else { System.out.println("성별을 잘못 입력하셨습니다.");
		
	
		
		
		
	}

}

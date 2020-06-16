package com.kita.first.mission;

import java.util.Scanner;

public class Mission3_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("성별을 입력해주세요(남/여) : ");
		String gender = scanner.next();
		
		
		
		if("남".equals(gender) || "여".equals(gender)) {
			
			int standHeight = 150;
			
			System.out.print("키를 입력해주세요 : ");
			int height = scanner.nextInt();
			
			if("남".equals(gender)) {
				standHeight = 160; // 매직 넘버 : 어떤 숫자들이 무슨 역할을 할 때 꼭 naming을 해야 함
			} 			
			
			if(height > standHeight) {
				System.out.println("평균 초과입니다.");
			} else if(height == standHeight) {
				System.out.println("평균입니다.");
			} else {
				System.out.println("평균 미만입니다.");
			}
			
		} else {
			System.out.println("성별을 잘못 입력하셨습니다.");			
		}
		
		
	}
}

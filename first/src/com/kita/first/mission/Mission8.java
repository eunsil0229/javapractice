package com.kita.first.mission;

import java.util.Scanner;

public class Mission8 {
	public static void main(String[] args) {
		// 랜덤값 10 ~ 90을 맞히는 게임
		Scanner scanner = new Scanner(System.in);
		
		int min = 10;
		int max = 90;
		int cnt = 0;
		
		int correct = (int)((Math.random() * (max - min + 1)) + min);
		// System.out.println(correct);
		
		while(true) {
			cnt++;
			System.out.println("<<" + cnt + "번째 시도>>");
			System.out.print("값 입력 : ");
			int num = scanner.nextInt();
			System.out.println();
			
			/*
			if(num > 90 || num < 10) {
				System.out.printf("%d 이상 %d 이하의 숫자로 다시 입력해주세요.\n", min, max);
				continue;
			}
			
			if(num == correct) {
				System.out.println("Great!!");
				break;
			} else if(num > correct) {
				System.out.println("DOWN");
			} else {
				System.out.println("UP");
			}	
			*/
			
			if(num <= max && num >= min) {
				if(num == correct) {
					System.out.println("Great!!");
					break;
				} else if(num > correct) {
					System.out.println("DOWN");
				} else {
					System.out.println("UP");
				}	
			} else {
				System.out.printf("%d 이상 %d 이하의 숫자로 다시 입력해주세요.\n", min, max);
			}
			
			
			
			
		}
		
		scanner.close();
				

	}

}

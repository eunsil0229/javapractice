package com.kita.first.mission;

import java.util.Scanner;

public class GreateMission {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("몇 개의  숫자를 맞히시겠습니까? > ");
		final int LEN = scanner.nextInt();
		
		int[] correct = new int[LEN];
		int[] myAnswer = new int[LEN];
		
		
		// 랜덤숫자 추출
		for(int i=0; i<LEN; i++) {
			correct[i] = (int)(Math.random()*9+1);
			for(int j=0; j<i; j++) {
				if(correct[i] == correct[j]) {
					i--;
					break;
				}
			}
		}
		
		
		
		// 정답보기
		System.out.println("\n정답을 보여줭");
		for(int num : correct) {
			System.out.print(num + " ");
		}
		System.out.println("\n");
		
		
		
		int cnt = 0;
		
		// 게임 시작
		while(true) {
			int strike = 0;
			int ball = 0;
			
			cnt++;
			System.out.printf("\n<<%d번째 시도>>\n", cnt);
			
			// 내 답 입력받기
			int x = 0;
			while(true) {
				System.out.printf("%d번째 숫자를 입력해주세요 : ", x+1);
				int num = scanner.nextInt();
				
				if(num < 1 || num > 9) {
					System.out.println("숫자를 다시 입력해주세요.");
				} else {
					myAnswer[x] = num;
					for(int i=0; i<x; i++) {
						if(myAnswer[x] == myAnswer[i]) {
							System.out.println("중복되지 않는 숫자를 입력해주세요.\n");
							x--;
							break;
						}
					}
					x++;
				}
				
				if(x == LEN) {
					break;
				}
			}
			
			
			// 볼? 스트라이크?
			for(int j=0; j<LEN; j++) {
				for(int z=0; z<LEN; z++) {
					if(correct[j] == myAnswer[z]) {
						if(j == z) {
							strike++;
						} else {
							ball++;
						}
					}	
				}
			}
			System.out.println();
			
			// 정답과 정답이 아닐 경우 출력
			if(strike == LEN) {
				System.out.println("정답입니다!");
				break;
			} else {
				System.out.printf("%d스트라이크 %d볼 %d아웃\n", strike, ball, (LEN-strike-ball));
				if(strike==0 && ball==0) {
					System.out.println("☆★☆★☆★꽝!☆★☆★☆★");
				} 
			}
			
			System.out.println("----------------------------");
		}
	}

}

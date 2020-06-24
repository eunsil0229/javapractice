package com.kita.first.mission;

import java.util.Scanner;

public class GreateMission2 {
	public static void main(String[] args) {
		/*
		 * 1. 사이다(500원)
		 * 2. 콜라(600원)
		 * 3. 환타(700원)
		 * 4. 마운틴듀(800원)
		 * 5. 초코우유(400원)
		 * 6. 바나나우유(400원)
		 * 
		 * 메뉴를 선택하세요(종료:0) : 1
		 * 사이다 500원
		 * 메뉴를 선택하세요 : 5
		 * 초코우유 400원
		 * 메뉴를 선택하세요 : 7
		 * 잘못 입력!
		 * 메뉴를 선택하세요: 0
		 * 종료		
		 * 900원 사용 
		 */
	
		
		String[] menu = {"사이다", "콜라", "환타", "마운틴듀", "초코우유", "바나나우유"};
		int[] price = {500, 600, 700, 800, 400, 400};
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		
		/*
		// 메뉴 만들어주기
		for(int i=0; i<len; i++) {
			System.out.print("메뉴 입력 : ");
			menu[i] = scanner.next();
			System.out.print("가격 입력 : ");
			price[i] = scanner.nextInt();
		}
		*/
		
		/*
		// 메뉴 선택하기
		while(true) {
			int sum = 0;
			
			System.out.print("메뉴를 선택하세요(종료 : 0) : ");
			int num = scanner.nextInt();
			
			if(num != 0) {
				if(num == 1) {
					System.out.printf("%s %d원\n", menu[num-1], price[num-1]);
					sum+=price[num-1];
				} else if(num == 2) {
					System.out.printf("%s %d원\n", menu[num-1], price[num-1]);
					sum+=price[num-1];
				} else if(num == 3) {
					System.out.printf("%s %d원\n", menu[num-1], price[num-1]);
					sum+=price[num-1];
				} else if(num == 4) {
					System.out.printf("%s %d원\n", menu[num-1], price[num-1]);
					sum+=price[num-1];
				} else if(num == 5) {
					System.out.printf("%s %d원\n", menu[num-1], price[num-1]);
					sum+=price[num-1];
				} else if(num == 6) {
					System.out.printf("%s %d원\n", menu[num-1], price[num-1]);
					sum+=price[num-1];
				} else {
					System.out.println("잘못 입력!");
				}
			} else {
				System.out.printf("종료! %d원 사용", sum);
			}
		}
		*/
		
		
		
		
	
	
		
		
		int sum = 0;
		while(true) {
			System.out.print("메뉴를 선택하세요(종료 : 0) : ");
			int num = scanner.nextInt();
			if(num != 0) {
				if(num < 7 && num > 0) {
					System.out.printf("%s %d원\n", menu[num-1], price[num-1]);
					sum+=price[num-1];
				} else {
					System.out.println("잘못 입력!");
				}
			} else {
				System.out.printf("종료! %d원 사용\n", sum);
				break;
			}
		}
		
		
		sum = 0;
		while(true) {
			
			int num = scanner.nextInt();
			if(num==0) {
				break;
			}
			switch(num) {
			case 1: case 2: case 3: case 4: case 5: case 6: { 
				System.out.printf("%d. %s %d원\n", num, menu[num-1], price[num-1]);
				sum+= price[num-1];
				break;
			}
		
			}
		}
		System.out.println("합계 : "+ sum);
		
		
		
		
		
	}

}











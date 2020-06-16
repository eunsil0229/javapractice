package com.kita.first.mission;

import java.util.Scanner;

public class Mission5 {
	public static void main(String[] args) {
		/*
		점수를 입력해주세요(0 ~ 100) : 
		90점 이상 : A
		80점 이상 : B
		70점 이상 : C
		나머지는 D입니다.

		일의 자리 수가 7점 이상이면 +
		일의 자리 수가 3점 이하이면 -

		예를 들어, 95점이면 A, 97점이면 A+
		*/
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력해주세요(0 ~ 100) : ");
		int score = scanner.nextInt();
		int pm = score % 10;
				
		if(score > 100 || score < 0) {
			System.out.println("점수를 잘못 입력했습니다.");
			return;
			
		} else if(score >= 90) {
			System.out.print("A");
		} else if(score >= 80) {
			System.out.print("B");
		} else if(score >= 80) {
			System.out.print("C");
		} else {
			System.out.print("D");
		}
		
		
		if(score == 100) {
			System.out.println("+입니다.");
		} else if(score < 100 && score >= 70) {
			if(pm >= 7) {
				System.out.println("+입니다.");
			} else if(pm <= 3) {
				System.out.println("-입니다.");
			} 
		} else {
			System.out.println("입니다.");
		}

		
		String sign = "";
		if(pm >= 7) {
			sign = "+";
		} else if (pm <= 3) {
			sign = "-";
		}
		
		
		switch(score / 10) {
		case 10 :
			System.out.println("A+");
			break;
		case 9 : 
			System.out.println("A" + sign);
			break;
		case 8 :
			System.out.println("B" + sign);
			break;
		case 7 :
			System.out.println("C" + sign);
			break;
		case 6: case 5 : case 4 : case 3 : case 2 : case 1 :
			System.out.println("D");
		break;
		default :
			System.out.println("점수를 잘못 입력하였습니다.");
			
			
			
		}
		
	

		
		
		
	}

}

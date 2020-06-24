package com.kita.first.mission;

public class MethodMission2 {
	public static void main(String[] args) {
		/*
		printStar(6);
		// ******
		
		printStar(3);
		// ***
		
		line();
			
		printStarSquare(6);
		
	
		
		printTriangle(5);
		
		
		printStarReverse(5);
		
		
		starStar(5,1);
		starStar(5,2);
		starStar(5,3);
		starStar(5,4);
		starStar(5,5);
		
		line();
		
		*/
		starStar2(5);
	}
	
	
	// 선 긋기 메소드
	public static void line() {
		for(int i=0; i<20; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	
	// 별 찍기 메소드
	public static void printStar(int num) {
		for(int i=0; i<num; i++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
	// 별 오름차순 찍기 메소드
	public static void printTriangle(int num) {
		for(int i=1; i<=num; i++) {
			printStar(i);
		}
		line();
	}
	
	// 별 내림차순 찍기 메소드
	public static void printStarReverse(int num) {
		for(int i=num; i>0; i--) {
			printStar(i);
		}
		line();
	}
	
	// 별 num만큼 정사각형으로 찍기 메소드
	public static void printStarSquare(int num) {
		for(int i=0; i<num; i++) {
			printStar(num);
		}
		line();
	}
	
	
	
	
	// 별을 오른쪽 정렬로 한줄만 찍기 메소드1
	/*
	public static void starStar(int total, int star) {
		for(int i=1; i<=total; i++) {
			if(i <= (total-star)) {
				System.out.print("  ");
			} else {
				System.out.print("* ");
			}
		}
		System.out.println();
	}
	*/
	
	
	// 별을 오른쪽 정렬로 한줄만 찍기 메소드2
	public static void starStar(int total, int star) {
		blank(total-star);
		printStar(star);
	}
		
	
	// 빈칸 찍기 메소드
	public static void blank(int num) {
		for(int i=0; i<num; i++) {
			System.out.print("  ");
		}
	}
	
	
	
	// 별을 오른쪽정렬 된 삼각형 찍기 메소드
	public static void starStar2(int num) {
		for(int i=1; i<=num; i++) {
			starStar(num, i);
		}
		line();
	}

	
	public static void starStar3(int num) {
		
	}
	
	
	
	
	
	
	
}

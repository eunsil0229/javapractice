package com.kita.first.mission;

public class MethodMission1 {
	public static void main(String[] args) {
		//guguDan(5);
		//guguDan(2);
		
		guguDan(4, 7);
		
		// 메소드 오버로딩 : 똑같은 메소드를 여러개 만들 수 있는 기법
		// 매개변수가 달라져야 함
		//(int a, String b)랑 (String a, int b)는 다름
		
	}
	
	// 단 하나만
	public static void guguDan(int dan) {
		System.out.printf("<<<<%d단>>>>\n", dan);
		for(int i=1; i<10; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, (dan*i));
		}
		System.out.println();
	}
	
	
	// sDan에서 eDan까지 출력1
	/*
	public static void guguDan(int sDan, int eDan) {
		for(int i=sDan; i<=eDan; i++) {
			System.out.printf("<<<<%d단>>>>\n", i);
			for(int j=1; j<10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, (i*j));
			}
			System.out.println();
		}	
	}
	*/
	

	// sDan에서 eDan까지 출력2
	public static void guguDan(int sDan, int eDan) {
		for(int i=sDan; i<=eDan; i++) {
			guguDan(i);
		}
	}
	
	
	
	
}

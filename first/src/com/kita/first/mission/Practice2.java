package com.kita.first.mission;

import java.util.Random;

public class Practice2 {
	public static void main(String[] args) {
		// 랜덤값 뽑기
		double r = Math.random(); // 메소드 이용
		System.out.println(r); // 0 이상 1 미만의 실수가 나옴
		
		// 0에서 9 사이의 랜덤값 추출
		
		int rVal = (int)(r * 10);
		System.out.println(rVal);
		
		// 0에서 15 사이
		int rVal2 = (int)(r * 16);
		System.out.println(rVal2);

		// 줄여서
		int rVal3 = (int)(Math.random() * 16);
		System.out.println(rVal3);
		
		// 1에서 16 사이
		//int rVal4 = (int)((Math.random() * 15) + 1);
		//System.out.println(rVal4);
		
		System.out.println("시작");
		while(true) {
			int rVal4 = (int)((Math.random() * 15) + 1);
			System.out.println(rVal4);
			if(rVal4 >= 15) {
				break;
			}
		}
		
		// 30에서 50 사이
		int rVal4 = (int)((Math.random() * 21) + 30);
		
		
		// 46에서 77 사이
		int rVal5 = (int)((Math.random()));
		
		
		
		
		
		// 객체 이용 Random r2 = new Random(); 
		
	
	}

}

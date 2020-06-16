package com.kita.first.mission;

public class Mission7_1 {
	public static void main(String[] args) {
		/*
		 * while문을 사용하여
		 *  1~100 모두 더한 값이 출력되도록 하세요.
		 */

		
	
		int sum = 0;
		int num = 1;
		// int sum = 0, num = 1;
		
		while(num < 101) { //(num++ < 100)
			sum += num;
			num++;
		}
		
		System.out.println("합계 : " + sum);
		
		
		sum = 0;
		num = 1;
		while(true) {
			sum += num;
			num++;
			
			if(num > 100) {
				break;
			}
		}
		System.out.println("합계 : " + sum);
	}

}

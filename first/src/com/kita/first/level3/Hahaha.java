package com.kita.first.level3;

import java.util.ArrayList;
import java.util.Scanner;

public class Hahaha {
	public static void main(String[] args) {
		/*
		 * -1이 입력될 때까지 이름을 입력받고, 가장 길이가 짧은 이름을 출력하는 프로그램을 ArrayList를 활용하여 작성하세요.
		 */
		/*
		ArrayList <String>list = new ArrayList();
		
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
			System.out.print("입력하세요 > ");
			String a = scanner.next();
			if(a.equals("-1")) {
				break;
			}
			list.add(a);
		}
		System.out.println("실행종료");
		
		int index = 0;
		for(int i=0; i<list.size(); i++) {
			if(list.get(index).length() > list.get(i).length() ) {
				index = i;
			}
		}
		
		System.out.println(list.get(index));
		*/
		
		// 배열 안의 값을 24로 나눈 나머지를 구해서 서로 다른 값이 몇 개 있는지 출력
		
		int[] numbers = {12, 23, 48, 42, 32, 50, 72, 34, 19, 74, 60, 40, 94};
		
		int[] nums2 = new int[numbers.length];
		
		for(int i=0; i<nums2.length; i++) {
			nums2[i] = numbers[i]%24;
		}
		
		for(int i=0; i<nums2.length; i++) {
			System.out.print(nums2[i] + " ");
		}
		System.out.println();
		
		int cnt = 0;
		for(int i=1; i<nums2.length; i++) {
			boolean a = false;
			for(int j=0; j<i; j++) {
				if(nums2[i] == nums2[j]) {
					a = true;
					System.out.print("j : " + j + " ");
					System.out.println(a);
				}
			}
			System.out.println(i + "----------");
			if(!a) {
				cnt++;
			}
			
		}
		
		System.out.println("cnt : " + cnt);
		
	}
}


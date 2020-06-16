package com.kita.first;

import java.util.Scanner; // 원래 있는 class를 쓰려면 imoprt를 해줘야 함

public class Scan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Scanner 클래스를 객체화 함		
		// import 쓰는 거 싫으면 java.util.Scanner scanner = new Scanner(System.in); 사용
	
		
		System.out.print("나이? ");
		int age = scan.nextInt();
		System.out.println("나이 : " + age);
		System.out.print("이름? ");
		String name = scan.next();
		System.out.println("이름 : " + name);
		
		scan.close(); // close 해주지 않아서 scan 밑에 밑줄 있음, 어차피 프로그램이 종료될 거라서 적지 않았음
		
		
	}

}

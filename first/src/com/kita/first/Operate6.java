package com.kita.first;

public class Operate6 {
	public static void main(String[] args) {
		String str1 = "안녕";
		String str2 = "안녕";
		
		// 원래 String은 아래처럼 사용해야 함
		String str3 = new String("안녕");
		String str4 = new String("안녕");
		
		System.out.println(str1 == str2); // 주소값 비교
		System.out.println(str3 == str4);
		
		// reference 변수끼리는 값 비교가 아니라 주소값 비교
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str1)); // 위 아래 결과 같음
		
		System.out.println(str3.equals(str4));
		System.out.println("안녕".equals("안녕1"));
		
		// 변수가 뒤에 오는 게 에러가 날 확률이 낮음
		System.out.println(str3.equals("안녕"));
		System.out.println("안녕".equals(str4)); // -> 위 코드 보다 에러가 날 확률이 낮음
		
		
		
		
	}

}

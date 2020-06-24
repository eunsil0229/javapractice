package com.kita.first;

public class Switch {
	public static void main(String[] args) {
		int num = 13;
		
		switch(num) {
		case 1 : // num이 1일 때
			System.out.println("1이다.");
			break;
			
		case 2 : System.out.println("2이다.");
			break; // 이 break를 없애지 않을 경우 다음 case까지 넘어가서 "3이다."도 출력이 됨
			
		case 3 : System.out.println("3이다."); break;
			
		default : // num이 1도 2도 3도 아닐 때
			System.out.println("1 ~ 3이 아니다.");
			break;
		}
		
		
		// switch는 equals를 안 써도 되므로 문자열을 비교할 때 자주 씀
		

		String num1 = "사";
		
		switch(num1) {
		case "일" :
			System.out.println("1이다.");
			break;
			
		case "이" : case "사" : System.out.println("짝수이다.");
			break; 
			
		case "삼" : System.out.println("3이다."); break;
			
		default :
			System.out.println("1 ~ 3이 아니다.");
			break;
		}
		
		
		
			
	}

}

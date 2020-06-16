package com.kita.first;

public class Operate7 {
	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 5;
		int n3 = 6;
		
		System.out.println(n1 == n2 && n1 == n3 && n2 == n3); // && = and
		// and 연산자는 true가 나오기 어려움 -> false가 나타날 가능성이 제일 높은 것을 제일 앞에 두기
		
		System.out.println(n1 == n2 || n1 == n3 || n2 == n3); // || = or
		// or 연산자는 false가 나오기 어려움 -> true가 나타날 가능성이 제일 높은 것을 제일 앞에 두기
		
		// &, |만 써도 되기는 하지만 쓰지 말기!
		
		
		
	}

}

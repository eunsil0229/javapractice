package com.kita.first;

public class If {
	public static void main(String[] args) {
		int n1 = 20;
		int n2 = 20;
		
		if(n1 > n2) { // if 뒤의 괄호 안에 올 수 있는 것은 boolean 밖에 없음
			System.out.println("n1이 n2보다 크다!");
			
		} else if(n1 == n2) {
			System.out.println("n1과 n2는 같다!");
			
		} else {
			System.out.println("n1이 n2보다 크지 않다!!");
		}
		
		System.out.println("끝!!");

	}

}

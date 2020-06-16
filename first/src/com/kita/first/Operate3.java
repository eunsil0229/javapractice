package com.kita.first;

public class Operate3 {
	public static void main(String[] args) {
		int n1 = 10;
		int cost = 1;
		n1 = n1 + cost; // 리터럴 값은 가능한 지양해야 함, 가급적 변수를 사용해서 작업 -> n1 = n1 + 1; 보다는 좌측 표현 사용
		System.out.println("n1 : " + n1);
		
		int n2 = 10;
		n2 = n2 + 2;
		System.out.println("n2 : " + n2); 
		 
		int n3 = 10;
		n3 += (-2); // 가독성 높이기!!
		System.out.println("n3 : " + n3);
		
		
	}

}

package com.kita.first;

public class ConditionOperator {
	public static void main(String[] args) {
		int num = 4;
		
		boolean isOdd = (num % 2 == 1 ? true : false); // 물음표와 콜론 기준
		System.out.printf("%d is odd? %b \n", num, isOdd);
		// 물음표 앞에 조건이 true이면 콜론 앞, false면 콜론 뒤를 쓰겠다는 뜻
		// 물음표 앞에는 무조건 boolean 식이 들어와야 함
		
		String result = (num % 2 == 1 ? "홀수" : "짝수");
		System.out.printf("%d is %s \n", num, result);
	}

}

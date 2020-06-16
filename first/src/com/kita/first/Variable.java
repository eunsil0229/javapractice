package com.kita.first;

public class Variable { // variable = 변수
	public static void main(String[] args) {
		// 변수 : 값을 저장할 수 있는 공간
		
		// 일반 변수 8개(이거 제외하면 전부 reference 변수)
		// 보라색 글자 : 예약어(변수 명으로 사용할 수 없음)
		char v1; // character 타입, 문자, 정수형		<- 변수 선언, 선언은 한 번만
		v1 = 'A'; // =은 오른쪽에 있는 값을 복사하여 왼쪽에 준다는 뜻
		System.out.println(v1);
		System.out.println('A');
		
		v1 = 'B'; // 변수 : 변할 수 있다는 뜻
		System.out.println(v1);
		
		byte v2; // 정수형, 1byte
		short v3; // 정수형, 2byte
		int v4; // 정수형, 4byte, 속도가 제일 빠르므로 사용함
		long v5; // 정수형, 8byte 
		
		// 오버플로우 : 타입이 저장할 수 있는  값보다 더 큰 값을 저장하려고 할 때
		v2 = 127;
		v2 = (byte)129; // <- 강제 형변환, 오버플로우 발생
		v3 = 540;
		v4 = 30;
		v5 = 50; // 작은 타입에서 큰 타입으로 저장할 때에는 자동 형변환이 됨
		
		// v2 = v3 <- 불가능 (v3가 v2보다 더 커서 값을 못 담음) 
		// v3 = v2 <- 가능
		// 변수와 변수가 만날 때 무조건 타입이 같아져야 함
		
		v2 = (byte)v3; // <- 오버플로우 발생
		
		System.out.println();
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		
		v2 = 127;
		System.out.println(v2 + 5); // int로 자동 변환됨
		
		float v6; // 실수형, 4byte, 100프로 정확한 값은 아니고 100프로에 근접한 값
		double v7; // 실수형, 8byte, 100프로 정확한 값은 아니고 100프로에 근접한 값
		// float이 빠르지만 범위가 더 넓은 double 더 정확함
				
		// v6 = 10.1; 강제로 double로 변환시켜줘야 함
		v6 = 10.1f;
		v6 = 10.1F; // 대소문자 구분 필요 없음
		v7 = 10.1;
		
		v6 = (float) v7;
		
		
		
		
		boolean v8; // 논리형, true or false
		
		System.out.println();
		v8 = true;
		System.out.println(v8);
		v8 = false;
		System.out.println(v8);
		
		// 리터럴 : 저장되는 값
	
		
		// reference 변수 (타입 앞에 대문자면 무조건 reference 변수)
		System.out.println();
		String r1;
		r1 = "안녕하세요.";
		System.out.println(r1);
		Variable r2; // 클래스 Variable
		// 변수명. 쳤을 때 뭐가 나오면 reference 변수
		
		
		
		
		
		
	}

}

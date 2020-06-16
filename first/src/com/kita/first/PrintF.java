package com.kita.first;

public class PrintF {
	public static void main(String[] args) {
		String name = "최은실";
		int age = 29;
		float vision = 0.88f;
		char bloodType = 'A';
		
		System.out.println("나의 이름은 " + name + "입니다. 나는 나이는 " + age + "살입니다."
				+ " 나의 시력은 " + vision + "입니다. 나의 혈액형은 " + bloodType + "형입니다.");
		
		// age가 int인데 String 더하기 사이에 끼면 String으로 바뀜(자동 타입 변환)
		
		System.out.printf("나의 이름은 %s입니다. 나의 나이는 %5d입니다. 나의 시력은 %.2f입니다. 나의 혈액형은 %c입니다.",
				name, age, vision, bloodType); 
		// %d 사이에 숫자를 넣으면 -> %3d 는 3자리로 구성되고 빈 자리는 공백으로 채워짐
		// %03d -> 3자리로 구성되고 빈 자리는 0으로 채워짐
		// %,d를 쓰면 천 단위에 ,가 들어감 -> 가독성이 좋아짐
		// 전부 다 %s로 써도 되긴 됨
		
		// 소스를 만들 때는 가능한 가독성 좋게 만들기
		
		System.out.println();

		char v1 = '0';
		System.out.printf("%c : %d\n", v1, (int)v1); // %와 뒤에 받는 값의 타입이 같아야 함
		
		byte v2 = 66;
		System.out.printf("%c : %d\n", (char)v2, v2);
		
		
		
	}

}

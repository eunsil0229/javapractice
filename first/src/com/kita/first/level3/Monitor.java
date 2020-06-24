package com.kita.first.level3;

public class Monitor {

	static String brand; // static이 붙으면 별개로 봄, static은 공용! // 클래스 변수
	int inch; // 인스턴스 변수
	
	
	void printInfo() {
		System.out.printf("brand : %s, inch : %d\n", this.brand, this.inch);
					// this 안 붙여도 됨
	}
	
	
	static void printBrand() {
		System.out.println(brand);
	}
	
	static void printInch() {
		// System.out.println(inch);	<- static 아닌 필드 못 씀!
	}
	
}

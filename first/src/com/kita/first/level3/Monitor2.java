package com.kita.first.level3;

public class Monitor2 {
	
	String brand;
	int inch;
	int cnt1;
	static int cnt;
	
	public Monitor2() {
		
	}
	public Monitor2(String brand, int inch) {
		super();
		cnt++;
		cnt1++;
		this.brand = brand;
		this.inch = inch;
	}
	
	
	
	void printInfo() {
		System.out.printf("brand : %s, inch : %d\n", this.brand, this.inch);
	}                                                               
}

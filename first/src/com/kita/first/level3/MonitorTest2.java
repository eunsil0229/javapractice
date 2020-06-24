package com.kita.first.level3;

public class MonitorTest2 {
	public static void main(String[] args) {
		Monitor.brand = "삼성";
		Monitor.printBrand();

		Monitor m1 = new Monitor();
		// Monitor.printInfo(); -> static이 안 붙은 메소드라서 객체를 만들어야 함
		m1.printInfo();
	
	}

}

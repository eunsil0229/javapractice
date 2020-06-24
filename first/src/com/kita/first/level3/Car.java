package com.kita.first.level3;

public class Car {
	String name;
	String color;
	int cc;
	
	public Car() {
		this("소나타", "흰색", 2500);
	}
	
	
	// 오른쪽 버튼 누르고  source -> generate 
	public Car(String name, String color, int cc) {
		
		// super 위에는 아무것도 못 씀!
		super();
		this.name = name;
		this.color = color;
		this.cc = cc;
	}
	
	
	
	public Car(String name) {
		this(name, "검정색",3000);				
	}
	
	public Car(String name, String color) {
		this(name, color,3000);
	}
	
	
	public void introduceMyCar() {
		System.out.printf("%s의 컬러는 %s이고 %dcc이다.\n", name, color, cc);
	}
	
	
	
	
}

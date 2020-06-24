package com.kita.first.level3;

public class TvTest {
	public static void main(String[] args) {
		new Tv(); // 객체는 생성되었지만 주소값을 몰라서 사용할 수 없음
		Tv tv1 = new Tv(); // new 키워드가 Tv를 객체화해서 주소값을 tv1에 넣어줌
			
		// Tv() -> 기본생성자
		// 객체를 생성할 때 딱 한 번만 씀
		
		
		System.out.println("name : " + tv1.name);
		System.out.println("power : " + tv1.power);
		System.out.println("channel : " + tv1.channel);
		
		System.out.println("-------------");
		tv1.name = "삼성TV";
		System.out.println("name : " + tv1.name);
		tv1.changePower();
		System.out.println("power : " + tv1.power);
		tv1.changePower();
		System.out.println("power : " + tv1.power);
		tv1.channelUp();
		tv1.channelUp();
		tv1.channelUp();
		System.out.println("channel : " + tv1.channel);
		
		
	}

}

package com.kita.first.level3;

public class TvTest2 {
	public static void main(String[] args) {
		Tv tv1 = new Tv();
		Tv tv2 = new Tv();
		
		tv1.channelUp();
		tv1.channelUp();
		
		tv2.channelUp();
		
		System.out.println("tv1 channel : " + tv1.channel);
		System.out.println("tv2 channel : " + tv2.channel);
		
		tv1 = tv2;
		
		System.out.println("tv1 channel : " + tv1.channel);
		System.out.println("tv2 channel : " + tv2.channel);
		
		// 객체가 하나밖에 안 만들어졌으므로 tv1이든 tv2든 가리키는 주소값은 같음
		
		// 두 개 다른 객체를 만들었을 때 tv1 = tv2; 으로 tv2의 주소값을 tv1한테 주는 순간 둘 다 tv2의 값이 됨
		
	}

}

package com.kita.first.level2;

public class Continue {
	public static void main(String[] args) {
		
		// continue는 패스, 스킵
		
		for(int i=0; i<20; i++) {
			if(i ==  5) {	continue;	}
			System.out.println(i);
			
		}
	}

}

package com.kita.first.level3;

public class Calc {
	
	static int n1;
	static int n2;
	
	static int sum (int n1, int n2) {
		return Calc.n1 + Calc.n2;		// -> this. 못 씀
	}
	
	int sum() {
		
		return n1 + n2;
	}
	


}

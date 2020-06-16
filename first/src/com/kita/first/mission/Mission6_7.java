package com.kita.first.mission;

public class Mission6_7 {
	public static void main(String[] args) {
		int star = 6;
		for(int i=1; i<=star; i++) {
			for(int j=0; j<star; j++) {
				if((i+j) >= star) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("-----------------------");
		
		for(int i=1; i<(star+1); i++) { //1~6
			for(int j=0; j<star; j++) { //0~5
				System.out.print(j < (star-i)? " " : "*"); // j<(star-i) 대신에 i<z도 가능
			}System.out.println("");
		}
		
		
		System.out.println("------------------------");
		
		for(int i=0; i<(star+1); i++) { //1~6
			for(int j=0; j<star; j++) { //0~5
				System.out.print(j < (star-i)? "*" : " ");
			}System.out.println("");
		}
	}
}


package com.kita.first.mission;

public class Mission6_3 {
	public static void main(String[] args) {
		/*
		 * 2 ~ 9단
		 * 
		 * 단!! 단이 바뀔 때 개행을 한번 더
		 */
		
		
		for(int i=26; i<34; i++) {
			for(int j=1; j<10; j++) {
				System.out.printf("%d * %d = %d\n", (i-24), j, ((i-24)*j));
			
			}
			System.out.println("-------------");
		}
		
		
		for(int i=0; i<6; i++) {
			for(int j=4; j>=0; j--) {
				if((i+j) >= 5) {
					System.out.printf("ㅂ");
				} else {
					System.out.printf("ㅇ");
				}			
			}
			System.out.println();
		}
	}

}

/*
ㅇㅇㅇㅇㅇ
1ㅇㅇㅇㅇ   
11ㅇㅇㅇ 

0 1 2 3 4
4 3 2 1 0

*/

package com.kita.first.mission;

public class Practice3 {
	public static void main(String[] args) {
		int len = 3;
		int[] arr = new int[len];
		
		// 1 ~ 9 중복되지 않는 값을 배열에 넣어보기
		
		int cnt = 1;
		for(int i=0; i<len; i++) {
			System.out.println("-------------------------");
			System.out.println(cnt + "번째");
			arr[i] = (int)((Math.random() * 9) + 1);
			
			System.out.println("i : " + i);
			System.out.println("0번 랜덤숫자 : " + arr[0]);
			System.out.println("1번 랜덤숫자 : " + arr[1]);
			System.out.println("2번 랜덤숫자 : " + arr[2]);
			
			for(int j=0; j<i; j++) {
				System.out.println("j : " + j);
				if(arr[i] == arr[j]) {
					System.out.println("arr[i]와 arr[j]가 같다면");
					i--;
					System.out.println("i : " + i);
					break;
				} else {
					System.out.printf("arr[%d]와 arr[%d]가 다르다면 출력\n", i, j);
				}
			}
			cnt++;
		}
		
		/* 
		for(int i=0; i<len; i++) {
			arr[i] = (int) (Math.random()*9 + 1);
			
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		*/
		
		
		
		/*
		int i = 0;
		while(true) {
			arr[i] = (int)((Math.random() * 9) + 1);
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
			i++;
			if(i == len-1) {
				break;
			}
		}
		
		*/
		 System.out.println();
		for(int num : arr) {
			System.out.print(num + " ");
		}
		
		
	}

}



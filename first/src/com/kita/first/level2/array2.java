package com.kita.first.level2;

public class array2 {
	public static void main(String[] args) {
		
		int[][] arr = new int[2][3];
		arr[0][0] = 10;
		arr[0][1] = 20;
		
		
		int[][] arr2 = {
				{10, 20, 30},
				{12, 13, 14, 11}
		};
		
		
		// 3차원 배열은 거의 안 씀
		int[][][] arr3 = new int[3][4][5]; // 사실 위와 아래는 별 큰 차이가 없음
		int[] arr4 = new int[60];

		
		for(int i=0; i<arr2.length; i++) {
			for(int z=0; z<arr2[i].length; z++) {
				System.out.print(arr2[i][z] + ", ");
			}
			System.out.println();
		}
		  
		System.out.println(arr.length);
		System.out.println(arr2.length);
		
		System.out.println(arr2[0].length);
		System.out.println(arr2[1].length);

		
		
	}

}

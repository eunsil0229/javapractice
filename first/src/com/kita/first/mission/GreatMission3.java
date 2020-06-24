package com.kita.first.mission;

public class GreatMission3 {
	public static void main(String[] args) {
		int[][] arr = {
				{90, 100, 88}, // 영어점수
				{34, 99, 45, 88}, // 수학
				{98, 65, 87}, // 국어
				{100, 88, 10} // 사회
		};
		
		/*
		 * 영어합계 : ?, 평균 : ?
		 * 수학합계 : ?, 평균 : ?
		 * 국어합계 : ?, 평균 : ?
		 * 전체합계 : ?, 평균 : ?
		 */
		
		// 이렇게 하면 int[][] a = new int[숫자][숫자] 이렇게 딱 맞는 배열만 가능
		int sum = 0;
		double avg = 0;
		
		String[] subject = {"영어", "수학", "국어", "사회"};
		
		
		for(int i=0; i<arr.length; i++) {
			int sum2 = 0;
			double avg2 = 0;
			
			for(int j=0; j<arr[i].length; j++) {
				sum += arr[i][j];
				sum2 += arr[i][j];
			}
			
			
			avg2 = (double) sum2/arr[i].length;
			System.out.printf("%s합계 : %d, 평균 : %.1f\n", subject[i], sum2, avg2);
		}
		
		avg = (double) sum/(arr.length*arr[0].length);
		System.out.printf("전체합계 : %d, 평균 : %.1f\n", sum, avg);
		
		
		
		// 중간 공백
		System.out.println();
		
		
		
		
		
		int[] sumArr = new int[subject.length];
		int totalCnt = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				sumArr[i] += arr[i][j];
				totalCnt += 1;
			}
		}
		
		
		int totalSum = 0;
		
		
		for(int i=0; i<subject.length; i++) {
			System.out.printf("%s합계 : %d, 평균 : %.1f\n", subject[i], sumArr[i], ((float)sumArr[i]/arr[i].length));
			totalSum += sumArr[i];
			// totalCnt를 totalSum 밑으로 내리고 tatalCnt += arr[i].length 로 써도 됨
			
		}
		
		System.out.printf("전체합계 : %d, 평균 : %.1f\n", totalSum, ((float)totalSum/totalCnt));
		
		
		
		// 웬만하면 출력 따로 카운트 따로 등등 하나의 코드는 하나의 기능만 하도록 만들기!!
		
		
	}

}

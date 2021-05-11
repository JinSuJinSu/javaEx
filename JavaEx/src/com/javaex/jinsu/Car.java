package com.javaex.jinsu;

public class Car {
	public static void main(String[] args) {
		int [][] scores = {
				{ 90, 70, 80, 75, 80 },
					{ 77, 90, 65, 80, 90 },
					{ 80, 75, 95, 80, 75 },
					{ 75, 80, 90, 85, 90 }
				};

//					2차원 배열 요소들의 총 합을 구하는 코드를 작성해 주세요

				int sum=0;

				for(int i=0; i< scores.length; i++) {
				for(int j=0; j< scores[i].length; j++) {
					sum+= scores [i][j];
				}
				}



					System.out.println(sum);

	}
}


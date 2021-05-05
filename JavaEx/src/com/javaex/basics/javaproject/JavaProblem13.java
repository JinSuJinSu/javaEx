package com.javaex.basics.javaproject;
import java.util.ArrayList;

public class JavaProblem13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 배열 내에서 85점 이상인 점수만 뽑아 총 합과 평균 값을 구하라
		int[][] scoreboards = {{80,75,90,95,78},{92,88,89,92,70},{78,80,85,86,63},{83,84,89,87,75},{89,83,93,94,78}};
		
		int count=0;
		int sum=0;
		
		ArrayList<Integer> numArray = new ArrayList<Integer>();
		for(int i=0; i<scoreboards.length; i++) {
			for(int j=0; j<scoreboards[i].length; j++) {
				if(scoreboards[i][j]>=85) {
					count+=1;
					sum+=scoreboards[i][j];
				}
			}
		}
		
		System.out.println("총합: "+sum);
		System.out.println("평균: "+String.format("%.2f", (float)sum/count));
		
	}
	

	}



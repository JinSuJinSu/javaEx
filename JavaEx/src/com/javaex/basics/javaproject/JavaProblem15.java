package com.javaex.basics.javaproject;
import java.util.ArrayList;

public class JavaProblem15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// �迭 ������ 85�� �̻��� ������ �̾� �� �հ� ��� ���� ���϶�
		int[][] scoreboards = {{80,75,90,95,78},{75,90,95,78},{80,75,90,95,78},{80,75,90,95,78},{80,75,90,95,78}};
		
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
		
		System.out.println(sum);
		System.out.println((float)sum/count);
		
	}
	

	}



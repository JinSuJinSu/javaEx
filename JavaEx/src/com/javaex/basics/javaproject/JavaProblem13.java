package com.javaex.basics.javaproject;
import java.util.ArrayList;

public class JavaProblem13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// �迭 ������ 85�� �̻��� ������ �̾� �� �հ� ��� ���� ���϶�
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
		
		System.out.println("����: "+sum);
		System.out.println("���: "+String.format("%.2f", (float)sum/count));
		
	}
	

	}



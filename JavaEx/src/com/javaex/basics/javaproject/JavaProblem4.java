package com.javaex.basics.javaproject;

public class JavaProblem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2���� �迭�� �� ����غ��ÿ�
		int[][] array = new int[10][10];
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length; j++) {
				array[i][j] = i+j+1;
			}
		}
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length; j++){
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
		
		

	}

}

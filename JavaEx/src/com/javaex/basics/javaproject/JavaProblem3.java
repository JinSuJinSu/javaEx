package com.javaex.basics.javaproject;

public class JavaProblem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 구구단을 출력하시오
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.print(j+"*"+i+"="+(j*i)+"\t");
			}
			System.out.println();
		}

	}

}

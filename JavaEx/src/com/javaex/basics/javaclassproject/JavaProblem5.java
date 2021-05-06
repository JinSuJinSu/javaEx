package com.javaex.basics.javaclassproject;

public class JavaProblem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1에서 100까지의 수에서 5의배수이면서 7의 배수인것을 출력하시오
		
		int number = 7;
		
		for(int i=7; i<=100; i++) {
			if(i%5==0 && i%7==0) {
				System.out.println(i);
				
			}
		}

	}

}

package com.javaex.basics.javaproject;

public class JavaProblem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 주어진 배열에서 3의 배수의 개수의 3의 배수의 합을 구하라
		int[]data = {1,3,5,8,9,11,15,19,18,20,30,33,31};
		
		int count=0;
		int sum=0;
		
		for(int value:data) {
			if(value%3==0) {
				count++;
				sum+=value;
			}
		}
		System.out.println("주어진 배열에서 3의 배수의 개수=>"+count);
		System.out.println("주어진 배열에서 3의 배수의 합=>"+sum);

	}

}

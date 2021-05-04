package com.javaex.basics.javaproject;
import java.util.ArrayList;
import java.util.Scanner;


public class JavaProblem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//5개의 입력값 중 최대값을 구하시오
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> numArray = new ArrayList<Integer>();
		
		for(int i=1; i<=5; i++) {
			int number = scan.nextInt();
			numArray.add(number);
			
		}
		
				
		int sum = numArray.stream().mapToInt(Integer::intValue).sum();
		int count= numArray.size();
		int avg = sum/count;

		System.out.println("평균은 " + (float)avg + " 입니다.");
		scan.close();
		
		
		
		

	}

}

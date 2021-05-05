package com.javaex.basics.javaproject;
import java.util.*;


public class JavaProblem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//5개의 입력값 중 최대값을 구하시오
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> numArray = new ArrayList<Integer>();
		
		for(int i=1; i<=5; i++) {
			int number = scan.nextInt();
			numArray.add(number);
			
		}
		
		System.out.print("최대값은 " + Collections.max(numArray) + "입니다.");
		scan.close();
		
		
		
		

	}

}

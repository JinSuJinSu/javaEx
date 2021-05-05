package com.javaex.basics.javaproject;
import java.util.*;

public class JavaProblem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 입력 값이 홀수이면 입력 값 까지의 홀수 합을 짝수면 짝수 값을 구하시오
		// ex) 5 = 1+3+5=9
		// ex) 4 = 1+2+4=7
		
		System.out.println("숫자를 입력하세요");
		
		
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		
		
		int total=0;
		
		if(number%2==0) {
			for(int i=2; i<=number; i+=2) {
				total+=i;
			}
		}
		else {
			for(int i=1; i<=number; i+=2) {
				total+=i;
			}
		}
		
		System.out.println("결과값: " + total);
		scan.close();

	}

}

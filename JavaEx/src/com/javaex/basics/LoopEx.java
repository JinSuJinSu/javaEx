package com.javaex.basics;

import java.util.Scanner;
import java.lang.Math;

public class LoopEx {

	public static void main(String[] args) {
//		whileEx();
//		whileGugu();
//		doWhileEx();
//		forEx();
//		continueEx();
		guGu();
//		numberJudge();
//		lotoCreation();
		starEx();
	}

	private static void doWhileEx() {
		//	while 문의 반복 조건을 뒤에서 확인
		//	최소 1회는 실행해야 하는 경우 do ~ while 문 사용
		//	사용자에게 숫자 입력 받아 모두 합산하는 코드
		//	사용자가 0을 입력하면 반복 종료
		int total = 0;
		int value = 0;

		Scanner scanner = new Scanner(System.in);

		do {	//	일단 실행 후 뒤에서 체크
			System.out.print("숫자를 입력하세요: [0이면 종료]:");
			value = scanner.nextInt();
			total += value;
		} while (value != 0);	//	0이 아니면 반복

		System.out.println("합계:" + total);
		scanner.close();
	}


	private static void whileGugu() {
		//	while 문을 이용한 구구표 출력
		Scanner scanner = new Scanner(System.in);

		System.out.print("단을 입력하세요:");
		int dan = scanner.nextInt();

		int i = 1;	//	루프 제어 변수

		while(i <= 9) {	
			System.out.println(dan + "*" + i + "=" + (dan * i));
			//	제어변수 증가\
			i++;
		}
		scanner.close();
		
	}

	private static void whileEx() {
		//	1부터 10까지 반복하면서 합산 후 결과 출력
		//	제어 변수 
		int num = 1;
		int total = 0;	//	합산 변수

		//	루프
		while(num <= 10) {
//			total = total + num;
			total += num;	
			//	while문은 무한 루프에 빠지기 쉬우므로
			//	제어변수를 적절히 변경해 줘야 한다
			num++;
		}

		System.out.println("합산값:" + total);

	}
	private static void forEx() {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		for(int i=1; i<10; i++) {
			System.out.println(number + " * " + i + " = " + (number*i));
		}
		
		
		scanner.close();
		
	}
	
	public static void continueEx() {
		for(int i=1; i<=20; i++) {
		if(i%2==0 || i%3==0) {
				continue;
			}
			else {
				System.out.println(i);
			}
		}
	}
	
	public static void guGu(){
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
		
	}
	
	public static void numberJudge(){
		int i=14;
	
		while(true) {
			if(i%6==0 && i%14==0) {
				break;
			}
			else {
				i++;
			}
			
		}
		System.out.println(i);
	}
	public static void lotoCreation() {
	for(int i=1; i<=6; i++) {
		int num = (int)(Math.random()*45)+1;
		System.out.println(num);
	}
	

}
	
	public static void starEx() {
		for(int i=1;i<6;i++){
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}

}
	}
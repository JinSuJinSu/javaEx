package com.javaex.basics.javaproject;
import java.util.Scanner;

public class JavaProblem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 입력 값이 홀수이면 입력 값 까지의 홀수 합을 짝수면 짝수 값을 구하시오
		// ex) 5 = 1+3+5=9
		// ex) 4 = 1+2+4=7
		
		Scanner scan = new Scanner(System.in);
		int money = scan.nextInt();
		String gameEndLine = "";
		for(int i=1; i<=20; i++) {
			gameEndLine+="-";
		}
		
		String bankCondition = "1.예금 | 2.출금 | 3.잔고 | 4.종료";
		boolean running = true;
		while(running) {
			System.out.println();
			System.out.print("선택>");
			int bankNumber = scan.nextInt();
			System.out.println();
			
			
			switch(bankNumber) {
			
			case 1:
				System.out.print("예금액>");
				int plusMony = scan.nextInt();
				money+=plusMony;
				break;
			
			case 2:
				System.out.print("출금액>");
				int minusMony = scan.nextInt();
				money-=minusMony;
				break;
				
			case 3:
				System.out.print("잔고액>");
				System.out.print(money);
				break;
			
			case 4:
				System.out.print("프로그램종료>");
				running = false;
				break;
			default:
				System.out.print("다시 입력해주세요");
}
		}

	}

}

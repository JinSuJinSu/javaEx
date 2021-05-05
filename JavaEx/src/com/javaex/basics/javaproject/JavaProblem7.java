package com.javaex.basics.javaproject;
import java.util.*;

public class JavaProblem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 입력 값이 홀수이면 입력 값 까지의 홀수 합을 짝수면 짝수 값을 구하시오
		// ex) 5 = 1+3+5=9
		// ex) 4 = 1+2+4=7
		
		Scanner scan = new Scanner(System.in);
		int number =  (int)(Math.random()*100)+1;
		String gameEndLine = "";
		for(int i=1; i<=20; i++) {
			gameEndLine+="-";
		}
		
		while(true) {
			System.out.print(">>");
			int inputNumber = scan.nextInt();
			if(inputNumber>number) {
				System.out.println("더 낮게");
			}
			else if(inputNumber<number) {
				System.out.println("더 높게");
			}
			else {
				scan.nextLine();
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하시겠습니까?(y/n) >>");
				String condition = scan.nextLine();
				
				
				if(condition.equals("y")){
					System.out.println(gameEndLine);
					System.out.println(gameEndLine);
					System.out.println("[숫자맞추기 게임 종료]");
					System.out.println(gameEndLine);
					System.out.println(gameEndLine);
					break;
					
				}
				else if(condition.equals("n")){
					number = (int)(Math.random()*100)+1;
					
				}
				else {
					System.out.println("에러 발생 에러 발생");
					break;
				}
				
				
				
	
				
				
			}
		}
		
		
		
		scan.close();

	}

}

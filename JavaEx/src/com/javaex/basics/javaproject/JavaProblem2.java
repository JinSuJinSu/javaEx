package com.javaex.basics.javaproject;
import java.util.Scanner; 

class JavaProblem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 임의의 숫자를 입력 받아 올바른 형식으로 출력하시오
		// ex) 3
		/*1
		  22
		  333
		 */
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		for(int i=1; i<=number; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		scan.close();
		
		

	}

}

package com.javaex.basics.javaproject;
import java.util.*;


public class JavaProblem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//5���� �Է°� �� �ִ밪�� ���Ͻÿ�
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> numArray = new ArrayList<Integer>();
		
		for(int i=1; i<=5; i++) {
			int number = scan.nextInt();
			numArray.add(number);
			
		}
		
		System.out.print("�ִ밪�� " + Collections.max(numArray) + "�Դϴ�.");
		scan.close();
		
		
		
		

	}

}

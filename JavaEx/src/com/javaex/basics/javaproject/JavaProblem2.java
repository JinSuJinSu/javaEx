package com.javaex.basics.javaproject;
import java.util.Scanner; 

class JavaProblem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ ���ڸ� �Է� �޾� �ùٸ� �������� ����Ͻÿ�
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

package com.javaex.basics.javaproject;
import java.util.*;

public class JavaProblem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �Է� ���� Ȧ���̸� �Է� �� ������ Ȧ�� ���� ¦���� ¦�� ���� ���Ͻÿ�
		// ex) 5 = 1+3+5=9
		// ex) 4 = 1+2+4=7
		
		System.out.println("���ڸ� �Է��ϼ���");
		
		
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
		
		System.out.println("�����: " + total);
		scan.close();

	}

}

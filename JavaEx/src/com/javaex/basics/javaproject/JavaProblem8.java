package com.javaex.basics.javaproject;
import java.util.Scanner;

public class JavaProblem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �Է� ���� Ȧ���̸� �Է� �� ������ Ȧ�� ���� ¦���� ¦�� ���� ���Ͻÿ�
		// ex) 5 = 1+3+5=9
		// ex) 4 = 1+2+4=7
		
		Scanner scan = new Scanner(System.in);
		int money = scan.nextInt();
		String gameEndLine = "";
		for(int i=1; i<=20; i++) {
			gameEndLine+="-";
		}
		
		String bankCondition = "1.���� | 2.��� | 3.�ܰ� | 4.����";
		boolean running = true;
		while(running) {
			System.out.println();
			System.out.print("����>");
			int bankNumber = scan.nextInt();
			System.out.println();
			
			
			switch(bankNumber) {
			
			case 1:
				System.out.print("���ݾ�>");
				int plusMony = scan.nextInt();
				money+=plusMony;
				break;
			
			case 2:
				System.out.print("��ݾ�>");
				int minusMony = scan.nextInt();
				money-=minusMony;
				break;
				
			case 3:
				System.out.print("�ܰ��>");
				System.out.print(money);
				break;
			
			case 4:
				System.out.print("���α׷�����>");
				running = false;
				break;
			default:
				System.out.print("�ٽ� �Է����ּ���");
}
		}

	}

}

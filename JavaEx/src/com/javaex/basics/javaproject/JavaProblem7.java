package com.javaex.basics.javaproject;
import java.util.Scanner;

public class JavaProblem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �Է� ���� Ȧ���̸� �Է� �� ������ Ȧ�� ���� ¦���� ¦�� ���� ���Ͻÿ�
		// ex) 5 = 1+3+5=9
		// ex) 4 = 1+2+4=7
		
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		String gameEndLine = "";
		for(int i=1; i<=20; i++) {
			gameEndLine+="-";
		}
		
		while(true) {
			int inputNumber = scan.nextInt();
			if(inputNumber>number) {
				System.out.println("�� ����");
			}
			else if(inputNumber<number) {
				System.out.println("�� ����");
			}
			else {
				scan.nextLine();
				System.out.println("�¾ҽ��ϴ�.");
				System.out.print("������ �����Ͻðڽ��ϱ�?(y/n) >>");
				String condition = scan.nextLine();
				
				
				if(condition.equals("y")){
					System.out.println(gameEndLine);
					System.out.println(gameEndLine);
					System.out.println("[���ڸ��߱� ���� ����]");
					System.out.println(gameEndLine);
					System.out.println(gameEndLine);
					break;
					
				}
				else if(condition.equals("n")){
					number = scan.nextInt();
					
				}
				else {
					System.out.println("���� �߻� ���� �߻�");
					break;
				}
				
				
				
	
				
				
			}
		}
		
		
		
		scan.close();

	}

}

package com.javaex.basics;
public class OperEx {
	public static void main(String[] args) {
//		arithOperEx();
//		logicOper();
		bitOper();
//		bitOper();
//		bitShift();
		conditionalOper();
	}

	//	3�� ������ : ���Ǻ� ����
	private static void conditionalOper() {
		int a = 10;

		//	a�� ¦��(2�� ���)�� ¦��, �ƴϸ� Ȧ��
		String message;
		//	���ǽ� ? ���� ���� ��: ������ ���� ��
		message = a % 2 == 0 ? "¦��": "Ȧ��";

		System.out.println(a + "�� " + message);

		int score = 40;

		//	80�� �̻��̸� Good
		//		80 ~ 50 �̸� Pass
		//		�� ���ϸ� Fail
		message = score >= 80 ? "Good":
							score >= 50 ? "Pass" : "Fail";
		System.out.println("����:" + score + ", ���:" + message);

	}

	//	��Ʈ ����Ʈ ������
	//	��Ʈ ���� �̵�
	private static void bitShift() {
		int data = 1;

		System.out.println(data);
		System.out.println("1��Ʈ ���� ����Ʈ:" + 
				Integer.toBinaryString(data << 1));	
		System.out.println("4��Ʈ ���� ����Ʈ:" +
				Integer.toBinaryString(data << 4));

		data = 0b1000;
		System.out.println("����:" +
				Integer.toBinaryString(data));
		System.out.println("1��Ʈ ���� ����Ʈ:" +
				Integer.toBinaryString(data >> 1));
		System.out.println("3��Ʈ ���� ����Ʈ:" +
				Integer.toBinaryString(data >> 3));
	}

	//	��Ʈ ������
	//	��Ʈ������ �̼��� ������ �ʿ��� �� ���
	//	�ϵ���� ����, �̹��� ���μ���
	private static void bitOper() {
		byte b1 = 0b1101;
		byte b2 = 0b0111;
		
		System.out.println("b1:" + Integer.toBinaryString(b1));
		System.out.println("b2:" + Integer.toBinaryString(b2));
		int result = b1 & b2;	//	��Ʈ �� ��: �Ѵ� 1�̾�� 1��Ʈ�� ����
		System.out.println("b1&b2:" + Integer.toBinaryString(result));
		result = b1 | b2;		//	��Ʈ �� ��: �� �� �� ���� 1�̸� 1��Ʈ ����
		System.out.println("b1|b2:" + Integer.toBinaryString(result));
		result = ~b1;	//	��Ʈ �� ���� : 1 <-> 0
		System.out.println("~b1:" + Integer.toBinaryString(result));
	}
	
	//	�񱳿���, ������
	//	����� boolean ��ȯ, �������� ���α׷��� �帧���� -> �߿�
	private static void logicOper() {
		//	�� ������ >, >=, <, <=, ==(����), !=(���� �ʴ�)
		int n1 = 7;
		int n2 = 3;
		
		System.out.println("a�� b�� ������? " + (n1 == n2));
		System.out.println("a�� b�� ���� ������? " + (n1 != n2));
		
		//	�� ���� : AND(����: &&), OR(����: ||), NOT(������: !)
		//	-> ������ ���ø���
		int n3 = 5;
		
		//	n3�� 0�ʰ�, 10�̸��� ���ΰ�?
		//		���� 1: n3 > 0
		//		���� 2: n3 < 10
		//		-> ���� 1 and ���� 2 : ������ ����
		boolean r1 = n3 > 0;	//	���� 1
		boolean r2 = n3 < 10;	//	���� 2
		boolean r1andr2 = r1 && r2;	//	n3 > 0 && n3 < 10
		System.out.println("n3�� 0 �ʰ� 10 �̸� ������ �ִ°�? " + r1andr2);
		
		//	n3�� 0�����̰ų� 10�̻��� ���ΰ�?
		//		���� 1: n3 <= 0
		//		���� 2: n3 >= 10
		//		-> ���� 1 or ���� 2 : ������ ����
		r1 = n3 <= 0;	//	���� 1
		r2 = n3 >= 10;	//	���� 2
		boolean r1orr2 = r1 || r2;	//	n3 <= 0 || n3 >= 10
		System.out.println("n3�� 0�����̰ų� n3�� 10�̻��� ����? " + r1orr2);
		
		//	not �� ���� -> true <-> false ����
		boolean rNot = !(n3 > 0 && n3 < 10);	//	������ ����
		//	-> n3 <= 0 || n3 >= 0
		System.out.println("������:" + rNot);
	}
	
	//	��� ������
	private static void arithOperEx() {
		int a = 7;
		int b = 3;
		
		//	��ȣ������: +, -
		System.out.println(-a);	//	a * -1
		
		//	��Ģ���� +, -, *, /
		System.out.println(a + "/" + b + "=" + (a / b));	//	���� �������� ��
		System.out.println("a�� b�� ���� ������:" + (a % b));	//	���� �������� ������
		
		//	���� / ���� -> ����
		
		//	���� �������� �����?
		System.out.println((float)a / (float)b);	//	int -> float�� ��ȯ
		System.out.println((float)a / b);	//	b�� float�� �ڵ� ��ȯ
		
		System.out.println("----------");
		//	���������� ++, --
		//	��ġ�� ���� ��������� �޶����� 
		a = 7;
		System.out.println("a:" + a);
		System.out.println("���� ��������:" + (++a));
		System.out.println("���� a:" + a);
		
		a = 7;
		System.out.println("a:" + a);
		System.out.println("���� ��������:" + (a++));
		System.out.println("���� a:" + a);
		
		//	������ ����
		a = 7;
//		System.out.println(a / 0); -> ������ 0���� ������ ArithmeticException
		System.out.println((float)a / 0);	//	Infinity
		
		//	Infinity�� ���Ե� ������� �׻� Infinity
		//	Infinity�� üũ
		System.out.println("7.0 / 0�� ���Ѽ��ΰ�? " + Double.isFinite(7.0/0));
		//	Infinity�� ���Ե� ����� -> Infinity
		
		System.out.println("0.0 / 0.0 ? " + (0.0 / 0.0));	//	Not A Number
		//	NaN�� ���Ե� ����� -> NaN : ���� �Ұ��� �ǹ�
		System.out.println("0.0 / 0.0 is NaN ? " + Double.isNaN(0.0 / 0.0));
		System.out.println(0.0 / 0.0 + 10);
	}
}

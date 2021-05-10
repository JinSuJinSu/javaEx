package com.javaex.api.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		dateEx();
//		dateEx();
		calendarEx();
	}

	private static void calendarEx() {
		//	Ķ���� �ҷ�����
		Calendar now = Calendar.getInstance();
//		System.out.println("NOW:" + now);
		Calendar custom = Calendar.getInstance();
		custom.set(1999, 11, 31); //	1999�� 12�� 31�� (�������� 0���� ����)

		//	���� �޾ƿ��� .get(Ķ���� ���)
		System.out.printf("������ %d�� %d�� %d���Դϴ�.%n", 
				now.get(Calendar.YEAR),
				now.get(Calendar.MONTH) + 1,	//	���� 0����
				now.get(Calendar.DATE));

		Calendar future = Calendar.getInstance();	//	���� ��¥ 
		//	100�� �ڷ� �̵�
		future.add(Calendar.DATE, 100); 
		System.out.printf("100�� �� future: %d�� %d�� %d��%n", 
				future.get(Calendar.YEAR),
				future.get(Calendar.MONTH) + 1,
				future.get(Calendar.DATE));
		//	�� ���� ���� ����?
		int dow = future.get(Calendar.DAY_OF_WEEK);
		System.out.println("100�� �� ����:" + dow);

		String dowStr = "?";
		switch(dow) {
		case Calendar.SUNDAY:	//	1
			dowStr = "�Ͽ���";
			break;
		case Calendar.MONDAY:	//	2
			dowStr = "������";
			break;
		case Calendar.TUESDAY:	
			dowStr = "ȭ����";
			break;
		case Calendar.WEDNESDAY:
			dowStr = "������";
			break;
		case Calendar.THURSDAY:
			dowStr = "�����";
			break;
		case Calendar.FRIDAY:
			dowStr = "�ݿ���";
			break;
		case Calendar.SATURDAY:
			dowStr = "�����";
		}
		//	���� ����: SUNDAY (1) ~ SATURDAY (7)
		System.out.println(dowStr);
	}

	private static void dateEx() {
		//	��¥ ������
		Date now = new Date();
		
		System.out.println(now);
		
		//	����ȭ ��� : DateFormat ��ü
		//	FULL, LONG, MEDIUM, SHORT -> �ٲ㰡�� ����� ����
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("FULL:" + df.format(now));
		df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("MEDIUM:" + df.format(now));
		
		//	SimpleDateFormat -> ���� ���ڿ��� �̿�, �����Ӱ� ��¥ ����
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy�� MM�� dd�� HH�� mm�� ss��");
		System.out.println("SDF:" + sdf.format(now));
	}
}
package com.javaex.basics.reftypes;

public class EnumEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		enumBasic();
		enumEx();

	}
	
	private static void enumBasic() {
		//enum�� �޼ҵ� ����
		Week today = Week.TUESDAY;
		System.out.printf("Today is %s(%d)%n",today.name(),today.ordinal());
		String dayStr = "FRIDAY";
		Week other = Week.valueOf(dayStr); //���ڿ��� ���Ż���� ��ȯ
		System.out.printf("Other is %s(%d)%n",other.name(),other.ordinal());
		
		int diff = today.compareTo(other);
		System.out.println("today�� other�� ����: " + diff);
		
	}
	private static void enumEx() {
		Week today = Week.TUESDAY;
		String act = "";

		//	MONDAY ~ THURSDAY : act <- ����
		//	FRIDAY : act <- �ұ�
		//	SATURDAY : act <- �ָ�
		//	SUNDAY : act <- �޽�
		//	������ : act <- ?
		switch (today) {
		case MONDAY:
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:
			act = "����";
			break;
		case FRIDAY:
			act = "�ұ�";
			break;
		case SATURDAY:
			act = "�ָ�";
			break;
		case SUNDAY:
			act = "�޽�";
			break;

		}
		System.out.printf("%s���� %s%n",today.name(), act);

		
	}

}

package com.javaex.basics.reftypes;

public class ArrayEx {

	public static void main(String[] args) {
//		arrayBasic();
//		multiDimArray();
//		arrayCopyFor();
		arrayCopySystem();
	}

	private static void arrayCopySystem() {
		//	System ��ü�� �̿��� �迭�� ����
		int source[] = { 1, 2, 3 };
		int target[] = new int[10];

		System.arraycopy(source,	//	���� �迭�� �ĺ���
				0,	//	 ���� ���� �ε���(���� �迭��)
				target, 	//	���� ��� �迭
				3,	//	���� ���� �ε���(��� �迭��)
				source.length);	//	������ ����

		//	���
		for (int i = 0; i < target.length; i++) {
			System.out.print(target[i] + "\t");
		}
		System.out.println();

		//	Enhanced For: ���� ��ü�κ��� ���� �ϳ��� �����Ͽ� �Ҵ�
		for (int value: target) {
			System.out.print(value + "\t");
		}
		System.out.println();
	}

	private static void arrayCopyFor() {
		//	�迭�� ũ�� ������ �ȵǴ�
		//	�� �迭�� ���� -> ����
		int source[] = { 1, 2, 3 };
		int target[] = new int[10];

		for (int i = 0; i < source.length; i++) {
			//	����
			target[i] = source[i];
		}

		for (int i = 0; i < target.length; i++) {
			System.out.print(target[i] + "\t");
		}
		System.out.println();
	}

	private static void multiDimArray() {
		//	2���� �迭 new type[���][����]
		//	3���� �迭 new type[��][���][����]
		int[][] twoDimen = new int[5][10];	//	5�� 10���� �迭

		int table[][] = {
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 },	
				{ 2, 3, 4, 5, 6, 7, 8, 9, 0, 1 },
				{ 3, 4, 5, 6, 7, 8, 9, 0, 1, 2 },
				{ 4, 5, 6, 7, 8, 9, 0, 1, 2, 3 },
				{ 5, 6, 7, 8, 9, 0, 1, 2, 3, 4 }
		};	//	�迭�� �迭

		//	�迭 ������ ��� ���� �ջ�
		int total = 0;

		System.out.println("table �迭�� ���:" + table.length);
		for (int row = 0; row < table.length; row++) {
			for (int col = 0; col < table[row].length; col++) {
				System.out.print(table[row][col] + "\t");
				total += table[row][col];
			}
			System.out.println();
		}
		System.out.println("�Ѱ�:" + total);
	}

	private static void arrayBasic() {
		//	����� �ʱ�ȭ, ���
		//	���� 
		String[] names;	//	Type[]
		int scores[];	//	�ĺ���[]

		//	�ʱ�ȭ
		names = new String[] {
				"ȫ�浿",
				"����",
				"����ġ",
				"�Ӳ���"
		};

		//	�迭 ����
		scores = new int[4];
		//	�ε����� �̿��� ���� : 0 ~ .length - 1
		scores[0] = 80;
		scores[1] = 90;
		scores[2] = 85;
		scores[3] = 88;
//		scores[4] = 100;	//	�ε��� ������ ��� ������ ����

		//	�� ����� ���� ���
		//	����� ���ÿ� �� ���� ��ȿ
		float heights[] = {
				175.3f,
				178.2f,
				165.3f,
				188
		};

		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%s (%.2f) : score = %d%n", 
					names[i], 
					heights[i],
					scores[i]);
		}

		//	����
		int scores2[] = scores;	//	���� ���� -> ����
		System.out.println("scores == scores2 : " + (scores == scores2));
		//	�� ��ü�� ���� ��ü��(���� �ּҸ� ����Ű�� �ִ�)
		//	scores -> ���� Ȯ��
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + "\t");
		}
		System.out.println();
		//	scores2 ����
		scores2[2] = 100;
//		scores -> ���� Ȯ��
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + "\t");
		}

	}
}
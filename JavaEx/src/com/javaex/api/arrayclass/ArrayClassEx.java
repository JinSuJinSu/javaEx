package com.javaex.api.arrayclass;
import java.util.Arrays;
import java.util.Collections;


public class ArrayClassEx {
	public static void main(String[] args) {
//		printArrayEx();
//		copyArrayEx();
		sortEx();
//		sortEx();
//		sortCustomEx();
		searchEx();
	}

	//	�迭 �� �˻�
	private static void searchEx() {
		Integer num2[] = { 5, 6, 3, 2, 4, 1, 7, 9, 8, 10 };
		//	�ڹٴ� �⺻������ ���� �˻�
		//	���� �˻��� �˻� ������ ���� �迭�� ���ĵǾ� �־�� �Ѵ�
		Arrays.sort(num2);
		System.out.println("���ĵ� ����:" + Arrays.toString(num2));
		int index = Arrays.binarySearch(num2, 8);
		System.out.println("8�� �ε���:" + index);

		//	String �迭�� �˻�
		String[] str = { "Java", "C", "C++", "Python", "Linux" };
		Arrays.sort(str); //	���� �˻� ������ ���� �켱
		System.out.println("����:" + Arrays.toString(str));
		index = Arrays.binarySearch(str, "Python");
		System.out.println("Python�� �ε���:" + index);

		//	����� ���� ��ü�� �˻�
		Member[] members = {
			new Member("ȫ�浿"),
			new Member("��浿"),
			new Member("����")
		};
		Arrays.sort(members);
		System.out.println("����:" + Arrays.toString(members));
		index = Arrays.binarySearch(members, new Member("ȫ�浿"));
		System.out.println("ȫ�浿�� �ε���:" + index);
	}

	//	����(����� ���� Ŭ����)
	private static void sortCustomEx() {
		Member[] members = {
			new Member("ȫ�浿"),
			new Member("��浿"),
			new Member("����")
		};
		System.out.println("����:" + Arrays.toString(members));
		Arrays.sort(members);
		System.out.println("����:" + Arrays.toString(members));
		Arrays.sort(members, Collections.reverseOrder());	//	�������� ����
		System.out.println("����(��������):" + Arrays.toString(members));
	}

	//	����
	private static void sortEx() {
		//	�⺻�� �˻�
		int[] nums = { 5, 6, 3, 2, 4, 1, 7, 9, 8, 10 }; 
		
		System.out.println("����:" + Arrays.toString(nums));
		//	����
		Arrays.sort(nums);
		System.out.println("���� ��(��������):" + Arrays.toString(nums));

//		nums = new int[] { 5, 6, 3, 2, 4, 1, 7, 9, 8, 10 }; 
//		System.out.println("����:" + Arrays.toString(nums));
//		
//		//	���� ��������
//		Arrays.sort(nums, Collections.reverseOrder());

	}

	//	�迭 �� �˻�
	private static void searchEx1() {
		Integer num2[] = { 5, 6, 3, 2, 4, 1, 7, 9, 8, 10 }; 
		System.out.println("����:" + Arrays.toString(num2));

		//	����(��������)
		Arrays.sort(num2, Collections.reverseOrder());
		System.out.println("���� ��(��������):" + Arrays.toString(num2));
	}

	private static void copyArrayEx() {
		int arr[] = new int[] {
				1, 2, 3, 4, 5, 6, 7, 8, 9, 10
		};
		
		int target[] = new int[arr.length];
		//	��� 1. ���� ���鼭 ����
		for (int i = 0; i < arr.length; i++) {
			target[i] = arr[i];	//	����
		}
		System.out.println("�迭 ����(for):" + Arrays.toString(target));
		//	��� 2. System ��ü �̿뺹��
		System.arraycopy(arr,	//	���� �迭 
				0,	 //	���� ���� ��ġ(���� �迭)
				target, //	������
				0,	//	���� ���� ��ġ(����������) 
				arr.length);	//	������ ����
		System.out.println("�迭 ����(System):" + Arrays.toString(target));
		//	��� 3. Arrays.copyOf
		target = Arrays.copyOf(arr,	//	���� �迭 
				arr.length);	//	������ ����
		System.out.println("�迭 ����(Arrays.copyOf):" + Arrays.toString(target));
		//	��� 4. Arrays.copyOfRange(�κ� ����)
		target = Arrays.copyOfRange(arr, 
				5,	//	���� �ε��� 
				arr.length);	//	�� �ε���
		System.out.println("�Ϻ� ����(copyOfRange):" + Arrays.toString(target));
	}
	
	private static void printArrayEx() {
		int arr[] = new int[] {
				1, 2, 3, 4, 5, 6, 7, 8, 9, 10
		};
		
		//	���
		System.out.println("arr[]: " + arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//	Arrays.toString();
		System.out.println("arr[]: " + Arrays.toString(arr));
	}
}
package com.javaex.io.charstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class ScannerEx {
	static String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String filename = rootPath + "thieves.txt";
	//	Scanner�� �������� �Է� �ҽ��κ��� ������ �Է� �޴� Ŭ����

	public static void main(String[] args) {
		// ���� ���� ����
		File file = new File(filename);

		try {
			Scanner scanner = new Scanner(file);
			String name;
			float height;
			float weight;

			//	�� ���� �о����
			while(scanner.hasNextLine()) {
				name = scanner.next(); // ���ڿ�
				height = scanner.nextFloat(); // �Ǽ�
				weight = scanner.nextFloat(); // �Ǽ�

				System.out.printf("%s, Ű:%f, ü��:%f%n",
						name, height, weight);
				scanner.nextLine();
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
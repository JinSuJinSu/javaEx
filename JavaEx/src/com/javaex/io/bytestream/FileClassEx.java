package com.javaex.io.bytestream;

import java.io.File;
import java.io.IOException;

public class FileClassEx {
	static String rootPath = System.getProperty("user.dir") + "\\files\\";

	public static void main(String[] args) {
		// ���� ��ü�� ����
		File root = new File(rootPath);
		//	������ ���� �����ϴ°� ?
		System.out.println(rootPath + ":" + root.exists());
		//	���� ���� ���
		printInfo(root);

		//	���͸� ���� : subdir
		File child = new File(rootPath + "\\subdir");	

		if (!child.exists()) {	//	������ ���͸��� ������
			child.mkdirs();
			System.out.println("subdir ����!");
		}

		//	���� ���� : myFile.txt
		File newFile = new File(rootPath + "myFile.txt");	//	���� ������ ����
		if (!newFile.exists()) {
			try {
				newFile.createNewFile();// ���� ���� ����
				System.out.println("myFile.txt ����!");
			} catch (IOException e) {
				System.err.println("������ ������ ���߾��!");
			}
		}
		printInfo(root);

		//	���� �����
		newFile.delete();
		printInfo(root);
	}

	private static void printInfo(File f) {
		System.out.println("--------------------");
		
		//	���� ��ü�� ���͸��ΰ�?
		if (f.isDirectory()) {
			System.out.println("Directory: " + f.getName());
			//	���� ��� Ȯ��
			File[] files = f.listFiles();
			for (File file: files) {
				if (file.isFile()) {	//	�����̸�
					System.out.printf("    f %s - %d%n", 
							file.getName(), file.length());
				} else {	//	���͸���
					System.out.printf("    d %s%n", 
							file.getName());					
				}
			}
		} else {
			System.out.println("File: " + f.getName());
		}
		
		System.out.println("--------------------");
	}
}
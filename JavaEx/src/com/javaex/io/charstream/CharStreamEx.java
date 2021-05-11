package com.javaex.io.charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx {
	static String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String filename = rootPath + "test.txt";

	public static void main(String[] args) {
		// �ؽ�Ʈ ��� (Writer)
		try {
			Writer fw = new FileWriter(filename);
			fw.write("Bit Computer\r\n");
			fw.write("Java Programming\r\n");
			fw.write("2021.05");
			fw.flush();  //	���� ����
			fw.close();

			System.out.println("���� ��� �Ϸ�!");

			//	�ؽ�Ʈ ���� �о����
			Reader fr = new FileReader(filename);

			System.out.println("----------");
			int data = 0;
			while((data = fr.read()) != -1) {
				//	int �а� -> ���� �����ʹ� ������ 2����Ʈ
				System.out.print((char)data);
			}
			System.out.println();
			fr.close();
			System.out.println("���� �б� �Ϸ�!");
		} catch (FileNotFoundException e) { 
			System.err.println("������ ã�� �� �����!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
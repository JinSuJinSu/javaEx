package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedCharStreamEx {
	static String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String source = rootPath + "last-leaf.txt";
	static String target = rootPath + "last-leaf-filtered.txt";

	//	leaf, leaves�� ���Ե� ������ -> last-leaf-filtered.txt�� ����
	public static void main(String[] args) throws IOException{
		try {
			//	�ֽ�Ʈ��
			Reader fr = new FileReader(source);
			Writer fw = new FileWriter(target);

			//	���� ��Ʈ��
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
			//	�ٴ��� ����¿� ���� �ΰ� �޼��带 ����
			String line = "";
			while((line = br.readLine()) != null) {
				//	���̻� ���� ������ ������ null
				//	leaf, leaves�� ����ִ� ���θ� ���, ����
				if (line.toLowerCase().contains("leaf") ||
						line.toLowerCase().contains("leaves")) {
					System.out.println("Found:" + line);
					//	���
					bw.write(line);
					bw.newLine(); //	����
				}
			}

			br.close();
			bw.close();

			System.out.println("���͸� �Ϸ�!");
		} catch (FileNotFoundException e) {
			System.err.println("������ ã�� ���߽��ϴ�.");


	}
	}
}


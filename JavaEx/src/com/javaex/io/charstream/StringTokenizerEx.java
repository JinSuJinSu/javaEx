package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

public class StringTokenizerEx {
	static String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String filename = rootPath + "thieves.txt";

	//	FileReader, BufferedReader, StringTokenizer�� �������� ����� ���ô�
	public static void main(String[] args) {
		try {
			Reader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);

			String line = "";	//	�ٴ��� ������ ���� ����

			while((line = br.readLine()) != null) {
				//	����
				StringTokenizer st = new StringTokenizer(line, " "); // �������� ����

				while (st.hasMoreTokens()) {	//	�����ִ� ��ū Ȯ��
					String token = st.nextToken();
					System.out.print(token + " ");
				}
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String jinsu = null;
		System.out.println(jinsu.length());
	}

}
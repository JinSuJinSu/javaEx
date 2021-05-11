package com.javaex.io.bytestream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedStreamEx {
	static String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String source = rootPath + "img.jpg";
	static String target = rootPath + "img_buffered_copy.jpg";

	public static void main(String[] args) {
		try {
			InputStream fis = new FileInputStream(source);	//	�ֽ�Ʈ��
			OutputStream fos = new FileOutputStream(target);	//	�ֽ�Ʈ��

			//	���� ��Ʈ�� : �ֽ�Ʈ�����κ��� Stream�� ���´�
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);

			//	������ �о����
//			int data = 0;
			byte[] data = new byte[10240];	//	10KB ¥�� ����
			int size = 0;	//	�о�� ������ ����Ʈ ��

			while((size = bis.read(data)) != -1) {
				bos.write(data);	//	���
				System.out.println(size + "����Ʈ �����߽��ϴ�");
			}

			bis.close();
			bos.close();
			//	���� ��Ʈ���� ������ ��� ��Ʈ���� ������

			System.out.println("������ �����߽��ϴ�!");
		} catch (FileNotFoundException e) {
			System.err.println("������ ã�� �� �����ϴ�.");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
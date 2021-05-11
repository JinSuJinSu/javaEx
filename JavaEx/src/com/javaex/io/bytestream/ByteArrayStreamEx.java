package com.javaex.io.bytestream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class ByteArrayStreamEx {

	public static void main(String[] args) {
		//	�Է� �ҽ�
		byte[] insrc = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		//	��� Ÿ��
		byte[] target = null;

		System.out.println("�Է� �ҽ�:" + Arrays.toString(insrc));

		try {
			InputStream bis = new ByteArrayInputStream(insrc);
			OutputStream bos = new ByteArrayOutputStream();

			int data = 0;	//	������ ���� ����

			while((data = bis.read()) != -1) {	//	-1�̸� ���� ������ ����
				System.out.println("Read Data:" + data);
				bos.write(data); //	������ ���
			}

			target = ((ByteArrayOutputStream)bos).toByteArray();
			System.out.println("target:" + Arrays.toString(target));

			bos.close();
			bis.close();
		} catch (IOException e) {
			//	����� ���ܴ� �̰����� ó��
			e.printStackTrace();
		} catch (Exception e) {
			//	������ ó�� ���� ���� ���ܸ� ö
		}
	}

}
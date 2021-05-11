package com.javaex.io.bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataStreamEx {
	static String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String filename = rootPath + "primitives.txt";

	public static void main(String[] args) {
//		writePrimitives();
		readPrimitives();
	}

	private static void readPrimitives() {
		//	����� �����͸� �ҷ��ͼ� �⺻Ÿ������ ����
		try {
			InputStream fis = new FileInputStream(filename);
			DataInputStream dis = new DataInputStream(fis);

			for (int i = 0; i < 2; i++) {
				//	����: ����� ������ �°� �Է� �޾ƾ� �Ѵ�
				String s = dis.readUTF(); // ���ڿ�
				boolean b = dis.readBoolean(); // ����
				int val = dis.readInt(); // ������
				float f = dis.readFloat(); // Float

//				double d = dis.readDouble();	-> Error
				System.out.printf("%s:%b:%d:%f%n", 
						s, b, val, f);
			}

			dis.close();
		} catch (FileNotFoundException e) {
			System.err.println("������ ã�� �� �����ϴ�.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void writePrimitives() {
		try {
			//	�ֽ�Ʈ��
			OutputStream fos = new FileOutputStream(filename);
			//	������Ʈ��
			DataOutputStream dos = new DataOutputStream(fos);

			//	�� �⺻Ÿ�� ������ ���� write �޼��尡 ���õǾ� �ִ�
			dos.writeUTF("ȫ�浿"); //	���ڿ�
			dos.writeBoolean(false); //	����
			dos.writeInt(25); //	������
			dos.writeFloat(80.9f); //	�Ǽ��� 

			dos.writeUTF("��浿"); //	���ڿ�
			dos.writeBoolean(true); //	����
			dos.writeInt(45); //	������
			dos.writeFloat(99.9f); //	�Ǽ���

			dos.close();

			System.out.println("�⺻������ Ÿ�� ����!");

		} catch (FileNotFoundException e) {
			System.err.println("������ ã�� �� �����ϴ�.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
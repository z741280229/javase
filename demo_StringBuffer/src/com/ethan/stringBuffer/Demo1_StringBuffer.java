package com.ethan.stringBuffer;

public class Demo1_StringBuffer {

	/**
	 * * A:StringBuffer�Ĺ��췽����
			* public StringBuffer():�޲ι��췽��
			* public StringBuffer(int capacity):ָ���������ַ�������������
			* public StringBuffer(String str):ָ���ַ������ݵ��ַ�������������
		* B:StringBuffer�ķ�����
			* public int capacity()�����ص�ǰ������	����ֵ(������)
			* public int length():���س��ȣ��ַ������� ʵ��ֵ
		* C:������ʾ
			* ���췽���ͳ��ȷ�����ʹ��
	 */
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb);
		System.out.println("---------------");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println("---------------");
		StringBuffer sb1 = new StringBuffer(10);
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		System.out.println("---------------");
		StringBuffer sb2 = new StringBuffer("ethan");
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		

	}

}

package com.ethan.stringBuffer;

public class Demo7_StringBuffer {

	/**
	 * * A:��ʽ��������
			* String��Ϊ��������
			* StringBuffer��Ϊ�������� 
		* B:������ʾ
			* String��StringBuffer�ֱ���Ϊ������������
			* 
	�����������͵�ֵ����,���ı���ֵ
	�����������͵�ֵ����,�ı���ֵ
	
	String����Ȼ��������������,������������������ʱ�ͻ�������������һ����
	 */
	public static void main(String[] args) {
		String s = "test";
		System.out.println(s);
		change(s);
		System.out.println(s);
		
		
		System.out.println("---------------------");
		StringBuffer sb = new StringBuffer();
		sb.append("test1");
		System.out.println(sb);
		change(sb);
		System.out.println(sb);
	}

	public static void change(StringBuffer sb) {
		sb.append("test2");
	}

	public static void change(String s) {
		s += "test3";
	}
}

package com.ethan.stringBuffer;

public class Demo4_StringBufferMethod {

	/**
	 * * A:StringBuffer���滻����
			* public StringBuffer replace(int start,int end,String str):
				* ��start��ʼ��end��str�滻
		* B:StringBuffer�ķ�ת����
			* public StringBuffer reverse():
				* �ַ�����ת
	 */
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("�򵥵Ĳ���");	
		System.out.println(sb);
		sb.replace(0, sb.length()-2, "this is a ");
		System.out.println(sb);
		StringBuffer sb1 = new StringBuffer("qwertrt");	
		sb1.reverse();
		System.out.println(sb1);
		

	}

}

package com.ethan.stringBuffer;

public class Demo5_StringBufferMethod {

	/**
	 * * A:StringBuffer�Ľ�ȡ����
		* public String substring(int start):
			* ��ָ��λ�ý�ȡ��ĩβ
		* public String substring(int start,int end):
			* ��ȡ��ָ��λ�ÿ�ʼ������λ�ã�������ʼλ�ã�����������λ��
	* B:ע������
		* ע��:����ֵ���Ͳ�����StringBuffer����
	 */
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("�򵥵Ĳ���");
		String str = sb.substring(3);
		System.out.println(sb);
		System.out.println(str);
		
		String str1 = sb.substring(3,4);
		System.out.println(sb);
		System.out.println(str1);
	}

}

package com.ethan.stringBuffer;

public class Demo6_StringBuffer {

	/**
	 * * A:String -- StringBuffer
		* a:ͨ�����췽��
		* b:ͨ��append()����
	* B:StringBuffer -- String
		* a:ͨ�����췽��
		* b:ͨ��toString()����
		* c:ͨ��subString(0,length);

	 */
	public static void main(String[] args) {
		
		demo1();
	}
	
	//��StringBufferת��ΪString
	public static void demo1() {
		StringBuffer sb = new StringBuffer("dasdasd");
		String str = new String(sb);
		System.out.println(str);	
		
		String str2 = sb.toString();
		System.out.println(str2);
		
		String str3 = sb.substring(0, sb.length());
		System.out.println(str3);
		
	}
	
	//��Stringת����StringBuffer
	public static void demo2() {
		StringBuffer sb = new StringBuffer("aasfas");
		System.out.println(sb);
		
		StringBuffer sb2 = new StringBuffer();
		sb2.append("dadasd");									//ͨ��append�������ַ���ת��ΪStringBuffer����
		System.out.println(sb2);
		
		
		
		
	}
	
	

}

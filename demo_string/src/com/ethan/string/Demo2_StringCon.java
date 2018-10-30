package com.ethan.string;

public class Demo2_StringCon {

	/**
	 	* public String():空构造
		* public String(byte[] bytes):把字节数组转成字符串
		* public String(byte[] bytes,int index,int length):把字节数组的一部分转成字符串
		* public String(char[] value):把字符数组转成字符串
		* public String(char[] value,int index,int count):把字符数组的一部分转成字符串
		* public String(String original):把字符串常量值转成字符串
	*/
	public static void main(String[] args) {
		//public String():空构造
		/*String str1 = new String();
		System.out.println(str1);*/
		
		
		//public String(byte[] bytes):把字节数组转成字符串
//		byte[] b = new byte[]{1,2,3,4};
//		byte[] b = new byte[]{98,99,100,101};
		/*byte[] b = {98,99,100,101};
		String str2 = new String(b);
		System.out.println(str2);*/
		
		//public String(byte[] bytes,int index,int length):把字节数组的一部分转成字符串
		/*byte[] b = {98,99,100,101};
		String str2 = new String(b,1,2);
		System.out.println(str2);*/
		
		//public String(char[] value):把字符数组转成字符串

		/*char[] c = {'a','m','g','d','c'};
		String str3 = new String(c);
		System.out.println(str3);*/
		char[] c = {'a','m','g','d','c'};
		String str3 = new String(c,2,3);
		System.out.println(str3);
		

	}

}

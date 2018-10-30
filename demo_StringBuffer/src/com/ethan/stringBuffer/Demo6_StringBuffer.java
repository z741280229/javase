package com.ethan.stringBuffer;

public class Demo6_StringBuffer {

	/**
	 * * A:String -- StringBuffer
		* a:通过构造方法
		* b:通过append()方法
	* B:StringBuffer -- String
		* a:通过构造方法
		* b:通过toString()方法
		* c:通过subString(0,length);

	 */
	public static void main(String[] args) {
		
		demo1();
	}
	
	//将StringBuffer转化为String
	public static void demo1() {
		StringBuffer sb = new StringBuffer("dasdasd");
		String str = new String(sb);
		System.out.println(str);	
		
		String str2 = sb.toString();
		System.out.println(str2);
		
		String str3 = sb.substring(0, sb.length());
		System.out.println(str3);
		
	}
	
	//将String转化成StringBuffer
	public static void demo2() {
		StringBuffer sb = new StringBuffer("aasfas");
		System.out.println(sb);
		
		StringBuffer sb2 = new StringBuffer();
		sb2.append("dadasd");									//通过append方法将字符串转换为StringBuffer对象
		System.out.println(sb2);
		
		
		
		
	}
	
	

}

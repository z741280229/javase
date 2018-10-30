package com.ethan.stringBuffer;

public class Demo1_StringBuffer {

	/**
	 * * A:StringBuffer的构造方法：
			* public StringBuffer():无参构造方法
			* public StringBuffer(int capacity):指定容量的字符串缓冲区对象
			* public StringBuffer(String str):指定字符串内容的字符串缓冲区对象
		* B:StringBuffer的方法：
			* public int capacity()：返回当前容量。	理论值(不掌握)
			* public int length():返回长度（字符数）。 实际值
		* C:案例演示
			* 构造方法和长度方法的使用
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

package com.ethan.stringBuffer;

public class Demo2_StringBuffer {

	/**
	 * * A:StringBuffer的添加功能
		* public StringBuffer append(String str):
			* 可以把任意类型数据添加到字符串缓冲区里面,并返回字符串缓冲区本身
		* public StringBuffer insert(int offset,String str):
			* 在指定位置把任意类型的数据插入到字符串缓冲区里面,并返回字符串缓冲区本身
		StringBuffer是字符串缓冲区,当new的时候是在堆内存创建了一个对象,底层是一个长度为16的字符数组
		当调用添加的方法时,不会再重新创建对象,在不断向原缓冲区添加字符
	 */
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("ethan");
		System.out.println(sb);
		
		/*StringBuffer sb1 = new StringBuffer();
		sb1.insert(1, "test");
		System.out.println(sb1);*/
		StringBuffer sb1 = new StringBuffer("this");
		StringBuffer sb2 = sb1.insert(1, "test");
		System.out.println(sb1);
		System.out.println(sb2);
		
		//StringBuffer 重写了通toString方法
		System.out.println(sb.toString());
		System.out.println(sb1.toString());
		System.out.println(sb2.toString());

	}

}

package com.ethan.stringBuffer;

public class Demo4_StringBufferMethod {

	/**
	 * * A:StringBuffer的替换功能
			* public StringBuffer replace(int start,int end,String str):
				* 从start开始到end用str替换
		* B:StringBuffer的反转功能
			* public StringBuffer reverse():
				* 字符串反转
	 */
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("简单的测试");	
		System.out.println(sb);
		sb.replace(0, sb.length()-2, "this is a ");
		System.out.println(sb);
		StringBuffer sb1 = new StringBuffer("qwertrt");	
		sb1.reverse();
		System.out.println(sb1);
		

	}

}

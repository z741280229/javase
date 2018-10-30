package com.ethan.stringBuffer;

public class Demo5_StringBufferMethod {

	/**
	 * * A:StringBuffer的截取功能
		* public String substring(int start):
			* 从指定位置截取到末尾
		* public String substring(int start,int end):
			* 截取从指定位置开始到结束位置，包括开始位置，不包括结束位置
	* B:注意事项
		* 注意:返回值类型不再是StringBuffer本身
	 */
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("简单的测试");
		String str = sb.substring(3);
		System.out.println(sb);
		System.out.println(str);
		
		String str1 = sb.substring(3,4);
		System.out.println(sb);
		System.out.println(str1);
	}

}

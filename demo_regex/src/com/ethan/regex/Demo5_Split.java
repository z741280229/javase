package com.ethan.regex;

public class Demo5_Split {

	public static void main(String[] args) {
		String str = "这.是一个.简单.的.测试";
		String[] strs = str.split("\\.");   //  .  在正则表达式中表示的是任意字符，所以需要两个\\将其转义
		for (String string : strs) {
			System.out.println(string);
		}

	}

}

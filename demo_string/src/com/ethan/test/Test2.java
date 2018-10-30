package com.ethan.test;

public class Test2 {

	/**
	 * * A:画图演示
	 * 需求：统计大串中小串出现的次数
	 * 这里的大串和小串可以自己根据情况给出
	 * 
	 */
	public static void main(String[] args) {
		
		String max = "woxiangquhangzhou,hangzhoushiyigehenbucuodechengshi,hangzhou";
		String min = "hangzhou";
		
		int count = 0;
		int index = 0;
		while((index = max.indexOf(min)) != -1) {
			count++;
			max = max.substring(index + min.length());
		}
		System.out.println(count);
	}
}

package com.ethan.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test4 {
	/**
	 *  当我们下载一个试用版软件,没有购买正版的时候,每执行一次就会提醒我们还有多少次使用机会用学过的IO流知识,模拟试用版软件,
	 *  试用10次机会,执行一次就提示一次您还有几次机会,如果次数到了提示请购买正版
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("time.txt"));
		
		String str_time = br.readLine();
		int times = Integer.parseInt(str_time);
		if(times > 0) {
			System.out.println("你还有"+times--+"机会");
			BufferedWriter bw = new BufferedWriter(new FileWriter("time.txt"));
			//bw.write(Integer.toString(times));
			bw.write(times+"");
			bw.close();
			
		}else {
			System.out.println("使用次数已用完，请购买正版");
		}
		br.close();
	}

}

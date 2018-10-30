package com.ethan.scanner;

import java.util.Scanner;

public class Demo2_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*System.out.println("请输入第一个整数:");
		int i = sc.nextInt();
		System.out.println("请输入第二个整数:");
		int j = sc.nextInt();
		System.out.println("i = " + i + ", j = " + j);*/
		
		/*System.out.println("请输入第一个字符串:");
		String line1 = sc.nextLine();
		System.out.println("请输入第二个字符串:");
		String line2 = sc.nextLine();
		System.out.println("line1 = " + line1 + ", line2 = " + line2 );*/
		
		
		
		/**
		 *输出结果为：
		 *请输入第一个整数:
			12
			请输入第二个字符串:12
			111111111112222222222222
			因为nextInt()在的遇到/r/n之后截取之前的整数结束了
			而nextLine()在遇到/r/n之后就直接直接结束了，当前一段10/r/n 10倍被截取之后，就剩下/r/n
			所以在输入回车时，直接结束
		 */
		/*
		System.out.println("请输入第一个整数:");
		int i = sc.nextInt();
		System.out.print("请输入第二个字符串:");
		String line2 = sc.nextLine();
		
		System.out.println(i);
		System.out.print("11111111111");
		System.out.print(line2);
		System.out.println("2222222222222");
		*/
		
		System.out.println("请输入第一个字符串");
		String line = sc.nextLine();
		System.out.println("请输入第二个字符串:");
		String line2 = sc.nextLine();
		
		System.out.print(line);
		System.out.println(line2);
		System.out.print(line);
		
	}
}

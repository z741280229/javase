package com.ethan.scanner;

import java.util.Scanner;

public class Demo1_Scanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		
		if(scan.hasNextInt()) {
			int i = scan.nextInt();
			System.out.println(i);
		}else {
			System.out.println("输入数据格式错误");
		}
	}

}

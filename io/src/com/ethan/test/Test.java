package com.ethan.test;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("test.txt");
		System.out.println("请输入：");
		Scanner scan =new Scanner(System.in);
		//String str;
		while(true) {
			String str = scan.nextLine();
			System.out.println(str.hashCode());
			if("quit".equals(str)) {
				break;
			}
			fos.write(str.getBytes());
			fos.write("\r\n".getBytes());
			
		}
		
		scan.close();
		fos.close();
		
	}

}

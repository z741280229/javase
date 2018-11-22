package com.ethan.test;

import java.io.File;
import java.util.Scanner;

public class Test5 {

	/**
	 * 需求:从键盘输入接收一个文件夹路径,打印出该文件夹下所有的.java文件名
	 * @param args
	 */
	public static void main(String[] args) {
		//printFiles(getFile());
		File file = getFile();
		printFiles(file);

	}
	
	public static File getFile() {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入文件夹路径：");
		while(true) {
			String path = scan.nextLine();
			File file = new File(path);
			
			if(!file.exists()) {
				System.out.println("你输入的文件夹路劲不存在，请重新输入：");
				path = scan.nextLine();
			}else if(file.isFile()) {
				System.out.println("你输入的文件路径，请重新输入：");
				path = scan.nextLine();
			}else {
				scan.close();
				return file;
			}
		}
				
	}
	
	public static void printFiles(File file) {
		File[] subFiles = file.listFiles();
		for (File file2 : subFiles) {
			if(file2.isFile() && file2.getName().endsWith(".java")) {
				System.out.println(file2);
			}else if(file2.isDirectory()) {
				printFiles(file2);
			}
		}
	}
}

package com.ethan.test;

import java.io.File;
import java.io.FilenameFilter;


public class Test1 {

	/**
	 * 需求：判断桌面目录下是否有后缀名为.avi的文件，如果有，就输出该文件名称
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File("/home/sam/桌面/day19(异常&IO(File类))/day19(异常&IO(File类))/day19(异常&IO(File类))/day19_video");
		String[] list = file.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				File file = new File(dir,name);
				
				return file.isFile() && file.getName().endsWith(".avi");
			}
		});
		
		for (String string : list) {
			System.out.println(string);
		}
	}
	
	public static void demo2(){
		File file = new File("/home/sam/桌面/day19(异常&IO(File类))/day19(异常&IO(File类))/day19(异常&IO(File类))/day19_video");
		File[] listFiles = file.listFiles();
		for (File file2 : listFiles) {
			if(file2.isFile()&&file2.getName().endsWith(".avi")){
				System.out.println(file2);
			}
		}
	}
	public static void demo1(){
		File file = new File("/home/sam/桌面/day19(异常&IO(File类))/day19(异常&IO(File类))/day19(异常&IO(File类))/day19_video");
		String[] fileName = file.list();
		for (String string : fileName) {
			if(string.endsWith(".avi")){
				System.out.println(string);
			}
		}
	}

}

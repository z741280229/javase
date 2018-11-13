package com.ethan.files;

import java.io.File;
import java.io.IOException;

public class Demo2_FileMethod {

	/**
	 * * A:创建功能
			* public boolean createNewFile():创建文件 如果存在这样的文件，就不创建了
			* public boolean mkdir():创建文件夹 如果存在这样的文件夹，就不创建了
			* public boolean mkdirs():创建文件夹,如果父文件夹不存在，会帮你创建出来
		* B:案例演示
			* File类的创建功能
		
			* 注意事项：
				* 如果你创建文件或者文件夹忘了写盘符路径，那么，默认在项目路径下。
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException{
		File file = new File("test.txt");
		file.createNewFile();
		
		File file1 = new File("test1");
		System.out.println(file1.mkdir());
		
		File file2 = new File("test2/test");
		System.out.println(file2.mkdirs());
	
		
		
		
	}
}

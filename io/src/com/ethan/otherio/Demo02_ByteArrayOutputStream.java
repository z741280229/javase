package com.ethan.otherio;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo02_ByteArrayOutputStream {

	/**
	 * @param args
	 * ByteArrayOutputStream
	 * 内存输出流
	 * 
	 * FileInputStream读取中文的时候出现了乱码
	 * 
	 * 解决方案
	 * 1,字符流读取
	 * 2,ByteArrayOutputStream
	 * @throws IOException 
	 * 
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		FileInputStream fis = new FileInputStream("test.txt");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		int len;
		while((len = fis.read()) != -1) {
			baos.write(len);
		}
		fis.close();
		System.out.println(baos);
		
		//byte[] arr1 = baos.toByteArray();									//将缓冲区的数据全部获取出来,并赋值给arr数组
		//System.out.println(new String(arr1));
		
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("test.txt");
		int len;
		byte[] arr = new byte[3];
		while((len = fis.read(arr)) != -1) {
			System.out.print(new String(arr,0,len));
		}
		fis.close();
	}

}

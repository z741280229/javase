package com.ethan.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo6_Chinese {

	/**
	 * @param args
	 * * 字节流读取中文的问题
			* 字节流在读中文的时候有可能会读到半个中文,造成乱码 
		* 字节流写出中文的问题
			* 字节流直接操作的字节,所以写出中文必须将字符串转换成字节数组 
			* 写出回车换行 write("\r\n".getBytes());
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		//demo2();
		FileOutputStream fos = new FileOutputStream("test6.txt");
		byte[] bytes = "这是一个简单的测试".getBytes();
		int len = 3;   // 这里的开发环境是在utf-8下面，所以这里写成3是可以正确写入到文本当中，但是如果写成是2,就会出现乱码
		int b = 0;
		while(b < bytes.length) {
			fos.write(bytes,b,len);
			b = b + len;
			
		}	
		fos.write("\r\n".getBytes());
		
		fos.close();
	}

	public static void demo2() throws FileNotFoundException, IOException {
		FileOutputStream fos = new FileOutputStream("test5.txt");
		fos.write("这是一个简单的测试".getBytes());
		fos.write("\r\n".getBytes());
		fos.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("test4.txt");
		byte arr[] = new byte[2];   // 这里采用的是utf-8，在utf-8下，一个中文占3个字节，所以在读取时候的，所以读取三个字节就能展示一个汉字
		// GBK码表 一个中文是2个字节，所以在输出的时候，会出现乱码
		int len;
		while((len = fis.read(arr)) != -1) {
			System.out.println(new String(arr,0,len));  // 利用String构造方法，将字节数组转化成字符串
		}
		fis.close();
	}

}

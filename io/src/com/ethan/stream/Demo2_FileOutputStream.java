package com.ethan.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2_FileOutputStream {

	/**
	 * FileOutputStream在创建对象的时候是如果没有这个文件会帮我创建出来
	 * 如果有这个文件就会先将文件清空
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//FileOutputStream fos = new FileOutputStream("test2.txt");   //这种情况在重新向文本当中写如数据的时候，以前的数据会被覆盖
		FileOutputStream fos = new FileOutputStream("test2.txt",true);   //加上true 就不会覆盖以前的数据(这里是指再次运行应用程序)，会在文件后面追加数据
		fos.write(99);
		fos.write(100);   //虽然写出的是一个int数,但是到文件上的是一个字节,会自动去除前三个8位
		fos.close();

	}

}

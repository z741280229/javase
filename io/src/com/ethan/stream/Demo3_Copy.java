package com.ethan.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3_Copy {

	public static void main(String[] args) throws IOException {
		//demo1();
		//demo2();
		FileInputStream fis = new FileInputStream("picture2.jpg");
		FileOutputStream fos = new FileOutputStream("picture3_copy.jpg");
		
		/*int len = fis.available();     //available()  读取文件大小 字节为单位
		System.out.println(len);*/
		
		byte copy[] = new byte[fis.available()];  //创建与文件一样大小的字节数组
		int i = 0;
		for (byte b : copy) {
			System.out.println(i+++":"+b);
			
		}
		fis.read(copy); //将文件上的字节读取到内存中
		fos.write(copy);  // //将字节数组中的字节数据写到文件上
		
		fis.close();
		fos.close();

	}

	public static void demo2() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("picture2.jpg");
		FileOutputStream fos = new FileOutputStream("picture1_copy.jpg");   //这里会将demo1()生成的文件给覆盖掉，重新变成picture2.jpg
		int b;
		while((b = fis.read()) != -1){
			fos.write(b);  //将每一个字节写出s
		}
		fis.close();
		fos.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("picture1.jpg");
		FileOutputStream fos = new FileOutputStream("picture1_copy.jpg");
		int b;
		while((b = fis.read()) != -1){
			fos.write(b);  //将每一个字节写出s
		}
		fis.close();
		fos.close();
	}

}

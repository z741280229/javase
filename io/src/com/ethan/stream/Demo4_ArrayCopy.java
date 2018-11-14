package com.ethan.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo4_ArrayCopy {

	/**
	 * 
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		//demo2();
		//demo3();
		FileInputStream fis = new FileInputStream("test1.txt");
		FileOutputStream fos = new FileOutputStream("test2.txt");   
		byte arr[] = new byte[2];
		int len;
		/*while((len = fis.read(arr)) != -1){    
			fos.write(arr, 0, len);    // 这里虽然是2个字节的写入，但是不会覆盖之前的数据，FileOutputStream("test2.txt")的含义是，再重新执行一次程序之后，数据会被覆盖，但是构造函数中加了true则不会
		}*/
		while((len = fis.read(arr)) != -1){    
			fos.write(arr);   //  这里是直接将arr数组当中的值全部写入文件  
		}
		fis.close();
		
		fos.close();
	}

	public static void demo3() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("test1.txt");
		byte arr[] = new byte[2];
		int a = fis.read(arr);
		System.out.println(a);
		System.out.println("------------");
		for (byte b : arr) {
			System.out.println(b);   //读取两个字节
		}
		System.out.println("*******************");
		int c = fis.read(arr);
		System.out.println(c);
		System.out.println("------------");
		for (byte b : arr) {
			System.out.println(b);   //读取两个字节
		}
		fis.close();    // 在流没有关闭之前，将继续向下读取，字节大小的个数
	}

	public static void demo2() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("test1.txt");
		byte arr[] = new byte[]{};
		//byte arr1[] = new byte[2];
		int a = fis.read(arr);
		System.out.println(a);
		System.out.println("------------");
		for (byte b : arr) {
			System.out.println(b);   //无输出
		}
		fis.close();
	}

	public static void demo1() {
		char b = 97;
		char c = 'a';
		System.out.println(c);
		System.out.println(b);
		System.out.println(97);  //97
	}

}

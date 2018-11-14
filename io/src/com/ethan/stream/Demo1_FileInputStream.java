package com.ethan.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo1_FileInputStream {

	/**
	 * @param args
	 * @throws IOException  
	 * read()方法读取的是一个字节,为什么返回是int,而不是byte
	 * 
	 * 00010100 00100100 01000001 11111111 0000000
	 * 
	 * 10000001    byte类型-1的原码
	 * 11111110	   -1的反码
	 * 11111111    -1的补码
	 * 
	 * 00000000 00000000 00000000 11111111
	 */
	public static void main(String[] args) throws IOException {
		
		//demo1();
		FileInputStream fis = new FileInputStream("test1.txt");
		
		/*while(fis.read()!= -1){   读取一次
			System.out.println(fis.read());    //读取第二次，这里又将流指向下一个地址，所以不能完全展示出数据
		}*/
		 
		int b;  //不是成员变量，没有初始化为0
		while((b = fis.read()) != -1){
			System.out.println(b);
		}
		fis.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		//在test1.txt中只存在一个字母时a，当流没有关闭，那么指针将指向下一个，如果没有，将会返回-1
		FileInputStream fis = new FileInputStream("test1.txt");
		int a = fis.read();
		System.out.println(a);    //读取出是  97 ascall表当中对应的值
		
		int b = fis.read();
		System.out.println(b);    //-1
		
		int c = fis.read();
		System.out.println(c);  // -1 
		fis.close();
	}

}

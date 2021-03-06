package com.ethan.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo7_TryFinally {
	/**
	 * @param args
	 * @throws IOException 
	 */
	//JDK1.7异常关闭
	public static void main(String[] args) throws IOException {
		//demo1();
		try(
			FileInputStream fis = new FileInputStream("xxx.txt");   //具有自动关闭的功能
			FileOutputStream fos = new FileOutputStream("yyy.txt");  //具有自动关闭的功能
			MyClose mc = new MyClose();   //这里继承了AutoCloseable，所以具有自动关闭的功能
		){
			int b;
			while((b = fis.read()) != -1) {
				fos.write(b);
			}
		}
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("xxx.txt");
			fos = new FileOutputStream("yyy.txt");
			
			int b;
			while((b = fis.read()) != -1) {
				fos.write(b);
			}
		}finally {
			try{
				if(fis != null)
					fis.close();
			}finally {							//try fianlly的嵌套目的是能关一个尽量关一个
				if(fos != null)
					fos.close();
			}
		}
	}
}
class MyClose implements AutoCloseable {
	public void close() {
		System.out.println("我关了");
	}
}
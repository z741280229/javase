package com.ethan.iochar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo4_Buffered {

	/**
	 * @param args
	 * 带缓冲区的流中的特殊方法
	 * readLine()
	 * newLine();
	 * 
	 * newLine()与\r\n的区别
	 * newLine()是跨平台的方法
	 * \r\n只支持的是windows系统
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		//demo2();
		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		BufferedWriter fw = new BufferedWriter(new FileWriter("test1.txt"));
		String line;
		while((line = br.readLine())!=null) {
			fw.write(line); // 如果不加newLine(),文本不会换行
			fw.newLine();   //newLine()主要针对的是跨平台的使用
			//fw.write("\r\n");//效果同上
		}
		br.close();
		fw.close();
	}

	public static void demo2() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		BufferedWriter fw = new BufferedWriter(new FileWriter("test1.txt"));
		String line;
		while((line = br.readLine())!=null) {
			//System.out.println(line);
			System.out.print(line);
		}
		br.close();
		fw.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		String line;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
	}

}

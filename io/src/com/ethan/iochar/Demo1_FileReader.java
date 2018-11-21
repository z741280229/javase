package com.ethan.iochar;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo1_FileReader {

	/**
	 * 
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		FileReader fr = new FileReader("test.txt");
		int i;
		while((i = fr.read()) != -1) {
			System.out.println((char)i);    
		}
		fr.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("test.txt");
		int i = fr.read();
		System.out.println(i);  //读取的为第一个字
		fr.close();
	}

}

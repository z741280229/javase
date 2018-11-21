package com.ethan.iochar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo3_Copy {

	public static void main(String[] args) throws IOException {
		//demo1();
		//demo2();
		//demo3();
		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("test1.txt"));
		int c;
		//缓存区大小为8192
		while((c = br.read()) != -1) {
			bw.write(c);
		}
		
		br.close();
		bw.close();
		
	}

	public static void demo3() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("test.txt");
		FileWriter fw = new FileWriter("test1.txt");
		char[] arr =new char[1024];
		int len;
		while((len = fr.read(arr)) != -1) {
			fw.write(arr, 0, len);
		}
		fr.close();
		fw.close();
	}

	public static void demo2() throws FileNotFoundException, IOException {
		//字符流不能拷贝纯文本的文件,只能拷贝纯字符文本文件
		FileReader fr = new FileReader("picture1.jpg");
		FileWriter fw = new FileWriter("picture1_copy1.jpg");
		int i;
		while((i = fr.read()) != -1) {
			fw.write(i);
		}
		fr.close();
		fw.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("test.txt");
		FileWriter fw = new FileWriter("test1.txt");
		int i;
		while((i = fr.read()) != -1) {
			fw.write(i);
		}
		fr.close();
		fw.close();
		//Writer类中有一个2k的小缓冲区,如果不关流,就会将内容写到缓冲区里,关流会将缓冲区内容刷新,再关闭	
	}

}

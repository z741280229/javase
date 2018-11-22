package com.ethan.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Test1 {

	/**
	 * 将一个文本文档上的文本反转,第一行和倒数第一行交换,第二行和倒数第二行交换
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		ArrayList<String> list = new ArrayList<>();
		/*BufferedInputStream bis = new BufferedInputStream(new FileInputStream("test.txt"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("test1.txt")); */
		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("test1.txt"));
		String line;
		while((line = br.readLine()) != null) {
			list.add(line);
		}
		for(int i = list.size() - 1; i >= 0; i--) {
			bw.write(list.get(i));
			bw.newLine();
		}
		br.close();
		bw.close();

	}

}

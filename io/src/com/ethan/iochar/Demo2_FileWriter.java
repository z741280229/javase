package com.ethan.iochar;

import java.io.FileWriter;
import java.io.IOException;

public class Demo2_FileWriter {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("test.txt");
		fw.write("这是一个简单的测试");
		fw.write(97);
		fw.close();

	}

}

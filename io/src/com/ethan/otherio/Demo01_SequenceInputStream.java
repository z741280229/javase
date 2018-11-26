package com.ethan.otherio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class Demo01_SequenceInputStream {

	/**
	 * @param args
	 * 整合两个输入流
	 * SequenceInputStream(InputStream s1, InputStream s2)
	 * 整合多个输入流
	 * SequenceInputStream(Enumeration<? extends InputStream> e)
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		//demo2();
		FileInputStream fis1 = new FileInputStream("test1.txt");
		FileInputStream fis2 = new FileInputStream("test2.txt");
		FileInputStream fis3 = new FileInputStream("test3.txt");
		
		Vector<FileInputStream> files = new Vector<>();
		files.add(fis1);
		files.add(fis2);
		files.add(fis3);
		
		Enumeration<FileInputStream> en = files.elements();
		SequenceInputStream sis = new SequenceInputStream(en);
		
		FileOutputStream fos = new FileOutputStream("test4.txt");
		int len;
		while((len = sis.read()) != -1) {
			fos.write(len);
		}
		sis.close();
		fos.close();
	}

	



	public static void demo2() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("test.txt");
		FileInputStream fis1 = new FileInputStream("test1.txt");
		SequenceInputStream sis = new SequenceInputStream(fis, fis1);
		FileOutputStream fos = new FileOutputStream("test2.txt");
		int len;
		while((len = sis.read()) != -1) {
			fos.write(len);
		}
		sis.close();
		fos.close();
	}

	
	
	
	public static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("test.txt");
		FileOutputStream fos = new FileOutputStream("test2.txt");
		
		int len;
		while((len = fis.read()) != -1) {
			fos.write(len);
		}
		fis.close();
		
		FileInputStream fis1 = new FileInputStream("test1.txt");
		
		while((len = fis1.read()) != -1) {
			fos.write(len);
		}
		fis1.close();
		fos.close();
	}

}

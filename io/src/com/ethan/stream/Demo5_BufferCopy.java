package com.ethan.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo5_BufferCopy {

	/**
	 * 
	 * @param args
	 * @throws IOException
	 * close方法
	 * 具备刷新的功能,在关闭流之前,就会先刷新一次缓冲区,将缓冲区的字节全都刷新到文件上,再关闭,close方法刷完之后就能写了
	 * flush方法?
	 * 具备刷新的功能,刷完之后还可以继续写
	 */
	public static void main(String[] args) throws IOException {
		//demo1();
		//demo2();
		demo3();
	}

	/**
	 *
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void demo3() throws FileNotFoundException, IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("picture1.jpg")); 
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("picture1_copy.jpg"));
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b);
			bos.flush();  // 这种情况就是读取一次，就讲缓冲区的数据全部写的文件中，但是是每次都会刷新，所以效果会很慢，刷新之后还可以继续写入
			//bos.close(); //这种直接将流关闭，所以不能再接续写入了
		}
		bos.flush();  // 这种是最后一部分字节数据放在缓冲区，但是没有达到8192，所以不会写入到新的文件当中，要通过flush刷新，才能写入完全
	}

	/**
	 * 这种情况 picture1.jpg 大小为227,005  bytes，但是拷贝完成之后picture1_copy.jpg为221,184  bytes
	 * 因为没有关流或者刷新缓冲区，所以有一部分字节没有写入到拷贝的文件中，所以文件比较小，这一本文件还存在BufferedOutputStream缓冲区中，因为没有达到
	 * 8192大小，缓冲区的数据不会写入到新的文件当中的
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void demo2() throws FileNotFoundException, IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("picture1.jpg")); 
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("picture1_copy.jpg"));
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b);
		}
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("test1.txt");
		FileOutputStream fos = new FileOutputStream("test3.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b);
		}
		
		bis.close();
		bos.close();
	}

}

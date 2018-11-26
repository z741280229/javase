package com.ethan.otherio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.ethan.bean.Person;

public class Demo03_ObjectOutputStream {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		//demo1();
		Person p1 = new Person("张三", 23);
		Person p2 = new Person("李四", 24);
		Person p3 = new Person("王五", 25);
		Person p4 = new Person("赵六", 26);
		
		ArrayList<Person> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test.txt"));
		oos.writeObject(list);								//把整个集合对象一次写出
		oos.close();
	}

	public static void demo1() throws IOException, FileNotFoundException {
		Person p1 = new Person("张三",12);
		Person p2 = new Person("李四",12);
		Person p3 = new Person("王五",12);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test.txt"));
		
		oos.writeObject(p1);
		oos.writeObject(p2);
		oos.writeObject(p3);
		
		oos.close();
	}

}

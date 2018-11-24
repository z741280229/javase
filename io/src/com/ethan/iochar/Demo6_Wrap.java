package com.ethan.iochar;

public class Demo6_Wrap {

	/**
	 * 装饰设计模式
	 * @param args
	 */
	public static void main(String[] args) {
		Worker w = new Worker(new Student());
		w.code();

	}

}

interface Coder {
	public abstract void code();
}

class Student implements Coder{

	@Override
	public void code() {
		System.out.println("JavaSe");
		
	}
	
}

class Worker implements Coder{

	private Student s;
	
	public Worker(Student s) {
		this.s = s;
	}
	@Override
	public void code() {
		s.code();
		System.out.println("ssh");
		System.out.println("ssm");
	}
	/*private Student s;
	
	public void code() {
		s.code();
		System.out.println("ssh");
		System.out.println("ssm");
	}*/
	
	
}



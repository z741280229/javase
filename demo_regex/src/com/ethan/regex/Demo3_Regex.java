package com.ethan.regex;

public class Demo3_Regex {

	/**
	 * 	. 任何字符
		\d 数字：[0-9] 
		\D 非数字： [^0-9] 
		\s 空白字符：[ \t\n\x0B\f\r] 
		\S 非空白字符：[^\s] 
		\w 单词字符：[a-zA-Z_0-9] 
		\W 非单词字符：[^\w] 

	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		//demo4();
		//demo5();
		demo6();
	}
	
	public static void demo1() {
		String regex = "\\D";
		System.out.println("1".matches(regex));
		System.out.println("2".matches(regex));
		System.out.println("10".matches(regex));   
		System.out.println("b".matches(regex));
	}
	
	public static void demo2() {
		String regex = "\\d";
		System.out.println("1".matches(regex));
		System.out.println("2".matches(regex));
		System.out.println("10".matches(regex));   
		System.out.println("b".matches(regex));
	}
	
	public static void demo3() {
		String regex = "\\s";
		System.out.println("1".matches(regex));
		System.out.println("".matches(regex));  //false
		System.out.println("	".matches(regex));   
		System.out.println(" ".matches(regex));
	}
	
	public static void demo4() {
		String regex = "\\S";
		System.out.println("1".matches(regex));
		System.out.println("".matches(regex));  //false
		System.out.println("	".matches(regex));   
		System.out.println(" ".matches(regex));
	}
	
	public static void demo5() {
		String regex = "\\w";
		System.out.println("a".matches(regex));    //true
		System.out.println("ad".matches(regex));   //false
		System.out.println("_".matches(regex));   //true
		System.out.println("%".matches(regex));   //false
		System.out.println("1".matches(regex));   //true
	}
	
	public static void demo6() {
		String regex = "\\W";
		System.out.println("a".matches(regex));    
		System.out.println("ad".matches(regex));   
		System.out.println("_".matches(regex));   
		System.out.println("%".matches(regex));   
		System.out.println("1".matches(regex));   
	}

}

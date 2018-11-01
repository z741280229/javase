package com.ethan.regex;

public class Demo2_Regex {

	/**
	 * [abc] a、b 或 c（简单类） 
		[^abc] 任何字符，除了 a、b 或 c（否定） 
		[a-zA-Z] a 到 z 或 A 到 Z，两头的字母包括在内（范围） 
		[a-d[m-p]] a 到 d 或 m 到 p：[a-dm-p]（并集） 
		[a-z&&[def]] d、e 或 f（交集） 
		[a-z&&[^bc]] a 到 z，除了 b 和 c：[ad-z]（减去） 
		[a-z&&[^m-p]] a 到 z，而非 m 到 p：[a-lq-z]（减去） 

	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		//demo4();
		demo5();
	}
	
	public static void demo1() {	
		String regex = "[abc]";
		System.out.println("a".matches(regex));
		System.out.println("b".matches(regex));
		System.out.println("c".matches(regex));
		System.out.println("d".matches(regex));
	}
	
	public static void demo2() {	
		String regex = "[^abc]";
		System.out.println("a".matches(regex));
		System.out.println("b".matches(regex));
		System.out.println("c".matches(regex));
		System.out.println("d".matches(regex));
	}
	public static void demo3() {	
		String regex = "[a-zA-Z]";
		System.out.println("a".matches(regex));
		System.out.println("b".matches(regex));
		System.out.println("c".matches(regex));
		System.out.println("d".matches(regex));
		System.out.println("Z".matches(regex));
		System.out.println("A".matches(regex));
		System.out.println("D".matches(regex));
		System.out.println("$".matches(regex));
	}
	
	public static void demo4() {	
		String regex = "[a-d[m-z]]";
		System.out.println("a".matches(regex));
		System.out.println("b".matches(regex));
		System.out.println("Z".matches(regex));
		System.out.println("$".matches(regex));
	}
	
	public static void demo5() {	
		String regex = "[a-e&&[^a-d]]";
		System.out.println("a".matches(regex));
		System.out.println("b".matches(regex));
		System.out.println("e".matches(regex));
		System.out.println("$".matches(regex));
	}
}

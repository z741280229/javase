package com.ethan.regex;

public class Demo6_ReplaceAll {

	public static void main(String[] args) {
		String str = "dada31312ewrtre";
		String regex = "\\d";
		String strs = str.replaceAll(regex, "");
		System.out.println(strs);

	}

}

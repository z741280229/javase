package com.ethan.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Test3 {

	public static void main(String[] args) throws IOException {
		HashMap<Character, Integer> hm = new HashMap<>();
		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		int len;
		while((len = br.read()) != -1) {
			char c = (char)len;
			/*if(!hm.containsKey(c)) {
				hm.put(c, 1);
			}else {
				hm.put(c, hm.get(c)+1);
			}*/
			hm.put(c, !hm.containsKey(c) ? 1:hm.get(c)+1);
		}
		br.close();
		BufferedWriter bw = new BufferedWriter(new FileWriter("time.txt"));
		for (Character c : hm.keySet()) {
			switch(c) {
			case '\t':
				bw.write("\\t"+":"+hm.get(c));
				break;
			case '\n':
				bw.write("\\n"+":"+hm.get(c));
				break;
			case '\r':
				bw.write("\\r"+":"+hm.get(c));
				break;
			default:
				bw.write(c+":"+hm.get(c));
				break;
			}
			
			

			//bw.write(c+":"+hm.get(c));
			bw.newLine();
		}
		bw.close();

	}

}

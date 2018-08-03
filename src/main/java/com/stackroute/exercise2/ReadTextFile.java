package com.stackroute.exercise2;

import java.io.BufferedReader;
import java.io.*;

public class ReadTextFile {
	public static void main(String[] args) {
		try {
		File file = new File("/home/user/test.txt");

		BufferedReader br = new BufferedReader(new FileReader(file));

		String st;
		while ((st = br.readLine()) != null) {
			System.out.println(st.toUpperCase());
		}
		br.close();
	}
	catch (IOException e){
		System.out.println("file not found");
	}
}
}
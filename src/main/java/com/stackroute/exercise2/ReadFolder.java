package com.stackroute.exercise2;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFolder {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter dirPath:");
		String dirPath = br.readLine();
		System.out.println("Enter the folder name");
		String folderName = br.readLine();

		String[] file = folderFiles(dirPath,folderName);
		for (int i = 0; i < file.length; i++) {
			System.out.println(file[i]);}
		
			System.out.println("enter any file from the above files");
			String Name = br.readLine();
			String fileName = fileName(dirPath,folderName,Name);
			System.out.println(fileName);

		}

	

	public static String[] folderFiles(String dirPath,String folderName) throws IOException {
		String[] arr = null;

		File f = new File(dirPath, folderName);

		if (f.exists()) {

			arr = f.list();

		}
		return arr;
	}

	public static String fileName(... String) throws IOException {
		String result="File not found";
		ReadFolder.folderFiles(arr[i]);
		for (int i = 0; i < file1.length; i++) {
			System.out.println(file1[i]);
			if(file1[i].contains(Name)) {
				result=Name;
			}
			}
		
		return result;
	}
}

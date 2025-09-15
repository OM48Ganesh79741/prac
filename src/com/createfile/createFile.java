package com.createfile;

import java.io.File;
import java.io.IOException;


//creating  a file
public class createFile {
	public static void main(String[] args) {

		try {

			for (int i = 0; i < 100; i++) {

				File file = new File("C:\\Users\\Shree\\Desktop\\java 8 features\\file_io\\abc"+i+".txt");
				boolean f;
				f = file.createNewFile();

				if (f) {
					System.out.println("file created");
				} else {
					System.out.println("file not created");
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

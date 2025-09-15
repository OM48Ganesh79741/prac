package com.createfile;

import java.io.File;

public class Deletefile {



	public static void main(String[] args) {

		try {

			

				File file = new File("C:\\Users\\Shree\\Desktop\\java 8 features\\file_io\\ganesh.txt");
				boolean f;
				f = file.delete();

				if (f) {
					System.out.println("file delete");
				} else {
					System.out.println("file not delete");
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

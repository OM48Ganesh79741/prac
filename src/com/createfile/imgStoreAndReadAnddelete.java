package com.createfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class imgStoreAndReadAnddelete
{
	public static void main(String[] args) 
	{
		String source="C:\\Users\\Shree\\Desktop\\java 8 features\\file_io\\Source\\img.png";
		String des="C:\\Users\\Shree\\Desktop\\java 8 features\\file_io\\Dest\\img.png";
		 try {
			FileInputStream fi=new FileInputStream(source);
	    	byte[] b=fi.readAllBytes();    
	    	
	    	FileOutputStream fos=new FileOutputStream(des);
			fos.write(b);
			
			 fi.close();
			 fos.close();
			
			File file=new File(source);
			file.delete();
			System.out.println("file deleted");

		 } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

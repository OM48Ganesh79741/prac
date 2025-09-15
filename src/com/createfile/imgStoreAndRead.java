package com.createfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class imgStoreAndRead
{
	public static void main(String[] args) 
	{
		 try {
			FileInputStream fi=new FileInputStream("C:\\Users\\Shree\\Desktop\\java 8 features\\file_io\\Source\\img.png");
	    	byte[] b=fi.readAllBytes();    
	    	
	    	FileOutputStream fos=new FileOutputStream("C:\\Users\\Shree\\Desktop\\java 8 features\\file_io\\Dest\\img.png");
			fos.write(b);
		 } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

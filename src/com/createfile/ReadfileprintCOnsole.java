package com.createfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;



public class ReadfileprintCOnsole 
{
	public static void main(String[] args) 
	{
		
		try {
			
		
//		String s="this is my data";
//		byte[] b=s.getBytes();
		
		FileInputStream fos=new FileInputStream("C:\\Users\\Shree\\Desktop\\java 8 features\\file_io\\ganeshtxt");
		while(true)
		{
			int i=fos.read();
			
			System.out.println(i);	System.out.print((char)i);
			if(i==-1)
			{
				break;
			}
		}
		
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}

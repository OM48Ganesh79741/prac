package com.createfile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;



public class WriteFile 
{
	public static void main(String[] args) 
	{
		
		try {
			
		
		String s="this is my data";
		byte[] b=s.getBytes();
		System.out.println(Arrays.toString(b));
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Shree\\Desktop\\java 8 features\\file_io\\ganesh.txt");
		  fos.write(b);
		  System.out.println("data send succesfully");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}

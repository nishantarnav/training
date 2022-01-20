package com.bajaj.training;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

class CustomException extends Exception
{

	public CustomException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	
	
}

//class

//variable
//method
//exception



//try  --which code has the error
//catch-- handle the error
//multiple catch block
//throws --whenever u want to throw exception at method level
//throw  --to throw new exception created by user
//Exception class--Which is parent class to every class in java 
//Exception have parent as Throwable

//checked exception  -- 10 
//FileNotFound
//SecurityException 
//unchecked exception  -- 10
 //java.lang.ArithmeticException
//
public class MyException {
	

	
	public static void myMain()
	{
		String a[]=new String[10];
		MyException.main(a);
	}
	
	public static void main(String args[]) 
	{
		//Exception - it is a special condition in java 
		//which break the flow.
		
	
	    int one=10;
	    int two=0;
	    int three=one/two;
		
		// not a error 
		//try block
		String str=null;
		if(str!=null)
		{
		if(str.equalsIgnoreCase("hello"))
		{
			
		}
		}
		
		int a[]=new int[0];
		 try
		 {
		 if(a.length==1)
		 {
		 a[0]=1;
		 
		
		 }
		 else
		 {
			 throw new CustomException("There is no space in array to fill this element");
		 }
			File file=new File("C/:");
			file.getAbsoluteFile();
			
			FileInputStream inputStream=new FileInputStream(file);
			
		 System.out.println(a[0]); 
		 }
		 catch(ArrayIndexOutOfBoundsException e)
		 {
			
		  e.printStackTrace();
		   
		 }
		 catch(CustomException e)
		 {
			
		  e.printStackTrace();
		   
		 }
		 catch(FileNotFoundException e)
		 {
			
		  e.printStackTrace();
		   
		 }
		 catch(Exception e)
		 {
			
		  e.printStackTrace();
		   
		 }
		 finally
		 {
			 System.out.println("Hello i am final");
		 }
		 
		
		
	}

}

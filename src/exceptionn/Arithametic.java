package exceptionn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Arithametic {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream f=new FileInputStream("E:\\book1.xlsx");
		
		try
		{
			String s=null;
			System.out.println(s.length());
		}
		catch(Exception e)
		{
		System.out.println(e.getMessage());	
		System.out.println("hai");
		}

	}

}

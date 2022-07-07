package com.serialization.inheritance;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class InheritanceSerialization {
	
	static {
		System.out.println("in static block 1");
	}
	
	public static void main( String []args) throws FileNotFoundException, IOException
	{
		
		final int r = 4;
		GovtCompany c = new GovtCompany();
		c.setAge(22);
		c.setAddress("govt address");
		c.setEmpName("emp name");
		c.setDept("dept");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("inh.txt"));
		oos.writeObject(c);
		
		int matrix[][] = { { 39, 27, 11, 42,78 },
                { 10, 93, 91, 90 },
                { 54, 78, 56, 89 },
                { 24, 64, 20, 65 } };
		System.out.println(matrix[0].length);
		
	
	}
	
	 class Test {
		
		static {
			System.out.println("in static block");
		}
	}

}

package com.serialization.inheritance;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class InheritanceDeserialization {
	
	public static void main(String []args) throws ClassNotFoundException, IOException
	{
		FileInputStream io = new FileInputStream("inh.txt");
        ObjectInputStream ois = new ObjectInputStream(io);
        GovtCompany res = (GovtCompany) ois.readObject();
        
        System.out.println(res.toString());
	}
	

}

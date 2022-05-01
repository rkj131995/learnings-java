package com.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializeClass {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream in = new FileInputStream("filenew.txt");
		ObjectInputStream ois = new ObjectInputStream(in);
		Employee resp = (Employee) ois.readObject();
		
		
		System.out.println(resp.getPwd());
		
		
		
	}

}
//
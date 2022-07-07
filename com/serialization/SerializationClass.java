package com.serialization;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

public class SerializationClass {

	public static void main(String[] args) throws IOException {

		Employee emp = new Employee();
		emp.setEmployeeId(10);
		emp.setName("ravi");
		emp.setSalary(123);
		emp.setT(OffsetDateTime.now());
		emp.setPwd("password");

		FileOutputStream file = new FileOutputStream("filenew.txt");
		ObjectOutputStream oos = new ObjectOutputStream(file);
		
		oos.writeObject(emp);
		
//		String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();
        double num = 1.34567;
        DecimalFormat df = new DecimalFormat("#00 .####");

      
		
		
		
		
	}

}

package com.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.List;

public class Employee  implements Serializable {
	
	/**
	 * 
	 */
	/**
	 * 
	 */
	private int employeeId;
	private  String name;
	private static int salary;
	private List<String> nick;
	private OffsetDateTime t;
	private transient String pwd;
	
	
	
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public List<String> getNick() {
		return nick;
	}
	public void setNick(List<String> nick) {
		this.nick = nick;
	}
	public OffsetDateTime getT() {
		return t;
	}
	public void setT(OffsetDateTime t) {
		this.t = t;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + "]";
	}
	
	private void writeObject(ObjectOutputStream oos) throws IOException 
	{

		oos.defaultWriteObject();
		
		String enpwd = "encrypt" + getPwd();
		
		oos.writeObject(enpwd);
		String en = "passwoeddddd";
		oos.writeObject(en);
		
	}
	
	private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException 
	{

		ois.defaultReadObject();
		
		String enpwd = (String) ois.readObject();
		
		this.pwd = enpwd.substring(3);
		
		System.out.println("this " + ois.readObject());
		
		
	}
}

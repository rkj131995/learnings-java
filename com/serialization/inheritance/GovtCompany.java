package com.serialization.inheritance;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class GovtCompany extends Company implements Externalizable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7641580395158607466L;
	transient String  empName;
	int age;
	String dept;

	
//	public GovtCompany() {
//		super();
//		System.out.println("child constructor......");	
//		}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "GovtCompany [empName=" + empName + ", age=" + age + ", dept=" + dept + "]";
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(this.age);
		out.writeObject(this.empName);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		this.age = in.readInt();
		this.empName = (String) in.readObject();
	}

}

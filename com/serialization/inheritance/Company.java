package com.serialization.inheritance;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Company{
	
	String name;
	int empNum;
	String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpNum() {
		return empNum;
	}
	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Company [name=" + name + ", empNum=" + empNum + ", address=" + address + "]";
	}
	
	

//	@Override
//	public void writeExternal(ObjectOutput out) throws IOException {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
//		// TODO Auto-generated method stub
//		
//	}

}

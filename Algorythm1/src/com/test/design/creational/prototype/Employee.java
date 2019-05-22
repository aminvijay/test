package com.test.design.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable{
	
	private List<String> empList;
	
	public Employee() {	
		empList = new ArrayList<String> ();
	}
	
	public Employee(List<String> list){
		empList = list;
	}
	
	
	public List<String> getEmpList() {
		return empList;
	}

	
	// this is heavy DB/IO/Network operation
	public void addEmployee() {
		empList.add("Jay");
		empList.add("Ajay");
		empList.add("Viay");
		empList.add("Sanjay");
	}
	
	public Object clone() throws CloneNotSupportedException{
		List<String> tmp = new ArrayList<String>();
		
		List<String> empList = getEmpList();
		for(String str:this.empList) {
			tmp.add(str);
		}
		
		return new Employee(tmp);		
	}
}

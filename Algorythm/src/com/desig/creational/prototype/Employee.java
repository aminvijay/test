package com.desig.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable{
	
	private List<String> empList;
	
	public Employee() {
		empList = new ArrayList<String>();
	}
	
	public Employee(List<String> list){
		this.empList = list;
	}
	
	//this is heavy loaded function ex DB, IO, network related
	public void loadData() {
		
		empList.add("Vijay");
		empList.add("Ajay");
		empList.add("Sanjay");
		empList.add("Jay");
	}
	
	public List<String> getEmpList(){
		return empList;
	}
	
	//override clone method
	
	public Object clone() {
		List<String> temp = new ArrayList<String>();
		for(String str: this.getEmpList()) {
			temp.add(str);
		}
		return new Employee(temp);
		
	}
	

}

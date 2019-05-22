package com.test.design.creational.prototype;

import java.util.List;

public class PrototypeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) { 
		try {
			Employee emp = new Employee();
			emp.addEmployee();
			List<String> empList = emp.getEmpList();
			
			Employee emp1 = (Employee) emp.clone();
			List<String> li1 = emp1.getEmpList();
			li1.add("amin");
			li1.add("patel");
			li1.add("shah");
			
			Employee emp2 = (Employee) emp.clone();
			List<String> li2 = emp2.getEmpList();
			li2.remove(1);
			li2.remove(1);
			
			System.out.println("empList = " + empList);
			System.out.println("li1 = " + li1);
			System.out.println("li2" + li2);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}

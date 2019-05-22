package com.desig.creational.prototype;

import java.util.List;

public class PrototypePatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.loadData();
		
		Employee emp1 = (Employee)emp.clone();
		Employee emp2 = (Employee) emp.clone();
		
		List<String> li1 = emp1.getEmpList();
		List<String> li2 = emp2.getEmpList();
		
		li1.add("amin");
		li1.add("patel");

		li2.remove(1);
		
		System.out.println(" emp list " + emp.getEmpList());
		System.out.println(" emp1 list " + li1);
		System.out.println(" emp2 list " + li2);
	}

}

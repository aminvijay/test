package com.doj.batch.processor;

import org.springframework.batch.item.ItemProcessor;

import com.doj.batch.bean.Employee;

/**
 * @author Dinesh Rajput
 *
 */
public class DataFilterProcessor implements ItemProcessor<Employee, Employee> {

	@Override
	public Employee process(Employee emp) throws Exception {
		if(emp.getSalary() > 70000.0){
			return emp;
		}else{
			return null;
		}
	}

}
